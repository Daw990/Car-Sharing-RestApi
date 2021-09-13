package pl.Dawid.carsharing.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import pl.Dawid.carsharing.entity.BrandCar;
import pl.Dawid.carsharing.entity.CompanyCar;
import pl.Dawid.carsharing.entity.ModelCar;
import pl.Dawid.carsharing.repository.BrandCarRepo;
import pl.Dawid.carsharing.repository.CompanyCarRepo;
import pl.Dawid.carsharing.repository.ModelCarRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BrandCarService {

    private static final int PAGE_SIZE = 3;

    private final ModelCarRepo modelCarRepo;
    private final BrandCarRepo brandCarRepo;
    private final CompanyCarRepo companyCarRepo;

    public List<BrandCar> findAllBrandCars(int page, Sort.Direction sort) {
        return brandCarRepo.findAllBrands(
                PageRequest.of(page, PAGE_SIZE,
                        Sort.by(sort, "id")
                )
        );
    }

    public BrandCar getBrandCarById(long id){

        Optional<BrandCar> result = brandCarRepo.findById(id);
        BrandCar brandCar = null;

        if(result.isPresent()){
            brandCar = result.get();
        }else{
            throw new RuntimeException("did not find brandCar with id = " + id);
        }
        return brandCar;
    }

    public List<BrandCar> findAllBrandCarsWithModels(int page, Sort.Direction sort) {
        List<BrandCar> allBrands = brandCarRepo.findAllBrands(
                PageRequest.of(page, PAGE_SIZE,
                        Sort.by(sort, "id")
                )
        );

        List<Long> ids = allBrands.stream()
                .map(BrandCar::getId)
                .collect(Collectors.toList());

        List<ModelCar> modelsCars = modelCarRepo.findAllByBrandCarIdIn(ids);
        allBrands.forEach(brand -> brand.setModels(extractModelCarsById(modelsCars, brand.getId())));

        return allBrands;
    }

    private List<ModelCar> extractModelCarsById(List<ModelCar> models, Long id) {
        return models.stream()
                .filter(model -> model.getBrandCarId() == id)
                .collect(Collectors.toList());
    }

    public BrandCar addBrandCar(BrandCar brandCar) {
        return brandCarRepo.save(brandCar);
    }

    /**
     *
     * @param brandCar
     * @return
     * Transactional for spring to see only one transaction. we dont must write
     * brandCarRepo.save(brandCarResult) in return
     * hibernate has "dirty checking" its check all downloaded entities and
     * when any entity is updated hibernate save it in fly.
     */
    @Transactional
    public BrandCar editBrandCar(BrandCar brandCar) {
        Optional<BrandCar> result = brandCarRepo.findById(brandCar.getId());
        BrandCar brandCarResult = null;

        if(result.isPresent()){
            brandCarResult = result.get();
        }else
            throw new RuntimeException("brandCar you want edit not exist");

        brandCarResult.setBrand(brandCar.getBrand());

        return brandCarResult;
    }

    public void deleteById(long id) {
        brandCarRepo.deleteById(id);
    }

    public List<CompanyCar> findAllCompanyCars(int page, Sort.Direction sort) {
        return companyCarRepo.findAllCompanyCars(
                PageRequest.of(page, PAGE_SIZE,
                        Sort.by(sort, "registrationNumber")
                )
        );
    }
}

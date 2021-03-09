package pl.Dawid.carsharing.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.Dawid.carsharing.entity.BrandCar;
import pl.Dawid.carsharing.repository.BrandCarRepo;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BrandCarService {

    private final BrandCarRepo brandCarRepo;

    public List<BrandCar> findAllBrandCars() {
        return brandCarRepo.findAllBrands(PageRequest.of(0, 2));
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
}

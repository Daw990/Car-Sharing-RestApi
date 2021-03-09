package pl.Dawid.carsharing.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import pl.Dawid.carsharing.controller.dto.BrandCarDto;
import pl.Dawid.carsharing.controller.dto.Mapper;
import pl.Dawid.carsharing.entity.BrandCar;
import pl.Dawid.carsharing.service.BrandCarService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final BrandCarService brandCarService;

    @GetMapping("/cars")
    public List<BrandCarDto> getCars(@RequestParam(required = false) Integer page, Sort.Direction sort){
        /**
         * secure from minus site example: page = -1.
         */
        int pageNumber = page!= null && page >= 0 ? page : 0;
        Sort.Direction sortDefault = sort != null ? sort : Sort.Direction.ASC;
        return Mapper.mapToBrandCarDtos(brandCarService.findAllBrandCars(pageNumber, sortDefault));
    }

    @GetMapping("/cars/models")
    public List<BrandCar> getCarsModels(@RequestParam(required = false) Integer page, Sort.Direction sort){
        /**
         * secure from minus site example: page = -1.
         */
        int pageNumber = page!= null && page >= 0 ? page : 0;
        Sort.Direction sortDefault = sort != null ? sort : Sort.Direction.ASC;
        return brandCarService.findAllBrandCarsWithModels(pageNumber, sortDefault);
    }

    @GetMapping("/cars/{id}")
    public BrandCar getCar(@PathVariable long id){

        return brandCarService.getBrandCarById(id);
    }

    @PostMapping("/cars")
    public BrandCar addBrand(@RequestBody BrandCar brandCar){
        return brandCarService.addBrandCar(brandCar);
    }

    @PutMapping("/cars")
    public BrandCar editBrand(@RequestBody BrandCar brandCar){
        return brandCarService.editBrandCar(brandCar);
    }

    @DeleteMapping("/cars/{id}")
    public void deleteBrandCar(@PathVariable long id){
        brandCarService.deleteById(id);
    }
}

package pl.Dawid.carsharing.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.Dawid.carsharing.entity.BrandCar;
import pl.Dawid.carsharing.service.BrandCarService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final BrandCarService brandCarService;

    @GetMapping("/cars")
    public List<BrandCar> getCars(){

        return brandCarService.findAllBrandCars();
    }

    @GetMapping("/cars/{id}")
    public BrandCar getCar(@PathVariable long id){

        return brandCarService.getBrandCarById(id);
    }
}

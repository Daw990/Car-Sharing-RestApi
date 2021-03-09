package pl.Dawid.carsharing.controller.dto;

import pl.Dawid.carsharing.entity.BrandCar;

import java.util.List;
import java.util.stream.Collectors;

public class Mapper {

    private Mapper() {
    }

    public static List<BrandCarDto> mapToBrandCarDtos(List<BrandCar> allBrandCars) {
        return allBrandCars.stream()
                .map(car -> mapToBrandCarDto(car))
                .collect(Collectors.toList());
    }

    private static BrandCarDto mapToBrandCarDto(BrandCar car) {
        return BrandCarDto.builder()
                .id(car.getId())
                .brand(car.getBrand())
                .created(car.getCreated())
                .build();
    }
}

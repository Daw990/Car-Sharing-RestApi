package pl.Dawid.carsharing.service.stubs;

import pl.Dawid.carsharing.entity.BrandCar;
import pl.Dawid.carsharing.entity.ModelCar;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BrandStub {

    public BrandCar getBrandCar(){

        BrandCar brandCar = new BrandCar();
        brandCar.setBrand("Ford");
        brandCar.setCreated(LocalDateTime.now());

        List<ModelCar> models = new ArrayList<>();
        models.add(new ModelCar("Focus"));
        models.add(new ModelCar("Galaxy"));
        models.add(new ModelCar("Mondeo"));

        brandCar.setModels(models);

        return brandCar;
    }
}

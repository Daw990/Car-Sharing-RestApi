package pl.Dawid.carsharing.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.Dawid.carsharing.entity.BrandCar;
import pl.Dawid.carsharing.entity.ModelCar;
import pl.Dawid.carsharing.repository.BrandCarRepo;
import pl.Dawid.carsharing.service.stubs.BrandStub;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BrandCarServiceTest {

    private static BrandStub brandStub;

    @Autowired
    private BrandCarService brandCarService;

    @Autowired
    private BrandCarRepo brandCarRepo;

    @BeforeAll
    public static void setUp(){
        brandStub = new BrandStub();
    }

    @BeforeEach
    void clearDB(){
        brandCarRepo.deleteAll();
    }

    @Test
    void should_delete_brandCar_by_id() {
        //given
        BrandCar brandCar = brandStub.getBrandCar();
        brandCarRepo.save(brandCar);
        Long id = brandCar.getId();
        //when
        brandCarService.deleteById(id);
        //then
        Optional<BrandCar> load = brandCarRepo.findById(id);
        assertTrue(load.isEmpty());
    }
    
    @Test
    void should_update_brandCar(){
        //given
        BrandCar brandCar = brandStub.getBrandCar();
        brandCarRepo.save(brandCar);
        Long id = brandCar.getId();
        //when
        brandCar.setBrand("Ford updated");
        brandCarService.editBrandCar(brandCar);
        //then
        BrandCar brandAfterUpdate = brandCarService.getBrandCarById(id);
        assertEquals(brandAfterUpdate.getBrand(), "Ford updated");
    }

    @Test
    void should_save_brandCar(){
        //given
        BrandCar brandCar = brandStub.getBrandCar();
        //when
        brandCarRepo.save(brandCar);
        //then
        Optional<BrandCar> load = brandCarRepo.findById(brandCar.getId());
        assertAll(() ->{
            assertTrue(load.isPresent());
            BrandCar brandCar1 = load.get();
            assertEquals(brandCar1.getBrand(), brandCar.getBrand());
        });
    }
}
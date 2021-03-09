package pl.Dawid.carsharing.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.Dawid.carsharing.entity.BrandCar;

import java.util.List;

@Repository
public interface BrandCarRepo extends JpaRepository<BrandCar, Long> {

    @Query("select p from BrandCar p")
    List<BrandCar> findAllBrands(Pageable page);
}

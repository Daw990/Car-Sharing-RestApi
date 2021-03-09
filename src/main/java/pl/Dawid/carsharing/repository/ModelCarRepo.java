package pl.Dawid.carsharing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.Dawid.carsharing.entity.ModelCar;

import java.util.List;

@Repository
public interface ModelCarRepo extends JpaRepository<ModelCar, Long> {

    List<ModelCar> findAllByBrandCarIdIn(List<Long> ids);
}

package pl.Dawid.carsharing.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.Dawid.carsharing.entity.CompanyCar;

import java.util.List;

@Repository
public interface CompanyCarRepo extends JpaRepository<CompanyCar, Long> {

    @Query("select c from CompanyCar c")
    List<CompanyCar> findAllCompanyCars(Pageable page);

}

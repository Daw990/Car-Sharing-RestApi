package pl.Dawid.carsharing.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class CompanyCars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String registrationNumber;
    boolean rented;
    boolean available;
    LocalDateTime created;
    LocalDateTime updated;

    @OneToOne
    ModelCar modelCarId;
    @OneToOne
    BrandCar brandCarId;




}

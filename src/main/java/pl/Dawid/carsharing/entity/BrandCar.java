package pl.Dawid.carsharing.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class BrandCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private LocalDateTime created;

    @OneToMany
    @JoinColumn(name = "brandCarId")
    private List<ModelCar> models;


}

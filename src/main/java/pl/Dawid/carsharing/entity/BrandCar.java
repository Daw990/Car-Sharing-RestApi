package pl.Dawid.carsharing.entity;

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
    /**
     * updatable, insertable
     * hibernate on update entiti want delete all "sub-entities" in this example
     * its list of modelcar. To avoid this set updatable = false and insertable = false
     */
    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "brandCarId", updatable = false, insertable = false)
    private List<ModelCar> models;


}

package pl.Dawid.carsharing.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ModelCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long brandCarId;
    private String model;
    private LocalDateTime created;

    @OneToOne
    @JoinColumn(name="modelCarId")
    private CompanyCar companyCar;


    public ModelCar(String model){
        this.model = model;
    }
}

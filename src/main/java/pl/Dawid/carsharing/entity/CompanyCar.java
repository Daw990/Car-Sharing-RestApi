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
public class CompanyCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long modelCarId;
    Long brandCarId;
    String registrationNumber;
    boolean rented;
    boolean available;
    LocalDateTime created;
    LocalDateTime updated;

}

package pl.Dawid.carsharing.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * DTO - Data Transfer Object
 * need it to avoid problem many querries (n+1)
 * hibernate
 */

@Data
@Builder
public class BrandCarDto {

    private Long id;
    private String brand;
    private LocalDateTime created;
}

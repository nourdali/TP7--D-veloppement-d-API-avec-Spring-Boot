package com.example.DeveloppementApi.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor

@RequiredArgsConstructor
@Table(name = "rentalContact")

public class RentalContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Property property;

    @ManyToOne
    private Owner owner;

    private String tenant;

    private double monthlyRent;
}

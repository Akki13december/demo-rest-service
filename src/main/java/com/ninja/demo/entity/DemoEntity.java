package com.ninja.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class DemoEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long customerID;
    @NotBlank (message = "Customer Name is mandatory")
    String customerName;
    String customerEmail;
    String customerCity;
}

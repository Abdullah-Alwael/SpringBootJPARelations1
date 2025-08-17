package com.spring.boot.springbootjparelations1.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "name can not be empty")
    @Column(columnDefinition = "varchar(30) not null")
    private String area;

    @NotEmpty(message = "name can not be empty")
    @Column(columnDefinition = "varchar(30) not null")
    private String street;

    @NotEmpty(message = "name can not be empty")
    @Column(columnDefinition = "varchar(30) not null")
    private String buildingNumber;

}

package com.techacademy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="country")
public class Country {
    @Id
    @Column(name = "code",columnDefinition = "char")
    private String code;
    @Column(name = "name",columnDefinition = "char")
    private String name;
    private int population;
}
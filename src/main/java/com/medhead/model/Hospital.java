package com.medhead.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "hospital")
@Table(name = "hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hospital_name")
    private String hospitalName;

    @Column(name = "hospital_latitude")
    private double latitude;

    @Column(name = "hospital_longitude")
    private double longitude;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "hospital_id")
    private List<Speciality> speciality = new ArrayList<>();
}

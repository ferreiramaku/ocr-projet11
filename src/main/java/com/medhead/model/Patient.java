package com.medhead.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "patient_latitude")
    private double latitude;

    @Column(name = "patient_longitude")
    private double longitude;

    @OneToOne
    @JoinColumn(name = "speciality_id", referencedColumnName = "id", nullable = false)
    private Speciality speciality;
}

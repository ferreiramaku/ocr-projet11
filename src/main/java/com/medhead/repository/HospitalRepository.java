package com.medhead.repository;

import com.medhead.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

    @Query(value = "SELECT h FROM hospital h WHERE h.hospitalName LIKE %?1%")
    List<Hospital> findByName(String name);
}

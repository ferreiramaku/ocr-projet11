package com.medhead.repository;

import com.medhead.model.GroupOfSpeciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<GroupOfSpeciality, Integer> {
}

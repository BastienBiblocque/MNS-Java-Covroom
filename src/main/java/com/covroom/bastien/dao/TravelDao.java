package com.covroom.bastien.dao;

import com.covroom.bastien.models.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TravelDao extends JpaRepository<Travel,Integer> {
}

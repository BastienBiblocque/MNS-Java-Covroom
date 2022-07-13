package com.covroom.bastien.dao;

import com.covroom.bastien.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatDao extends JpaRepository<Seat,Integer> {
}

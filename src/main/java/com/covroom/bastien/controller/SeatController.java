package com.covroom.bastien.controller;

import com.covroom.bastien.dao.SeatDao;
import com.covroom.bastien.dao.TravelDao;
import com.covroom.bastien.models.Seat;
import com.covroom.bastien.models.Travel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class SeatController {
    @Autowired
    SeatDao SeatDao;

    @GetMapping("/seat")
    public List<Seat> getTravel() {
        List<Seat> listeSeat = SeatDao.findAll();
        return listeSeat;
    }
}

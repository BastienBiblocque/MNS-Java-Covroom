package com.covroom.bastien.controller;
import com.covroom.bastien.dao.TravelDao;
import com.covroom.bastien.models.Travel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class TravelController {
    @Autowired
    TravelDao TravelDao;

    @GetMapping("/travel")
    public List<Travel> getTravel() {
        List<Travel> listeTravel = TravelDao.findAll();

        return listeTravel;
    }
}

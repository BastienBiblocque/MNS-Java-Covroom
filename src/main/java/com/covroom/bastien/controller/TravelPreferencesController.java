package com.covroom.bastien.controller;

import com.covroom.bastien.dao.TravelPreferencesDao;
import com.covroom.bastien.models.TravelPreferences;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelPreferencesController {
    @Autowired
    TravelPreferencesDao TravelPreferencesDao;

    @GetMapping("/travel-preferences")
    public List<TravelPreferences> getTravelPreferences() {
        List<TravelPreferences> listeTravelPrefrences = TravelPreferencesDao.findAll();

        return listeTravelPrefrences;
    }

    @PostMapping("/travel-preferences")
    public ResponseEntity<TravelPreferences> createTravelPreferences(@RequestBody TravelPreferences TravelPreferences) {
        TravelPreferencesDao.save(TravelPreferences);

        return ResponseEntity.status(HttpStatus.CREATED).body(TravelPreferences);
    }
}

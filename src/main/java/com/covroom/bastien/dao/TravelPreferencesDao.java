package com.covroom.bastien.dao;

import com.covroom.bastien.models.TravelPreferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelPreferencesDao extends JpaRepository<TravelPreferences, Integer> {

}

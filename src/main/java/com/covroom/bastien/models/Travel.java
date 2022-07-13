package com.covroom.bastien.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer seat_at_begining;
    private float start_latitude;
    private float end_latitude;
    private float start_longitude;
    private float end_longitude;
    private Date start_time;
    private Date end_time;

    @ManyToMany
    private List<TravelPreferences> TravelPreferences;

    public List<com.covroom.bastien.models.TravelPreferences> getTravelPreferences() {
        return TravelPreferences;
    }

    public void setTravelPreferences(List<com.covroom.bastien.models.TravelPreferences> travelPreferences) {
        this.TravelPreferences = travelPreferences;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeat_at_begining() {
        return seat_at_begining;
    }

    public void setSeat_at_begining(Integer seat_at_begining) {
        this.seat_at_begining = seat_at_begining;
    }

    public float getStart_latitude() {
        return start_latitude;
    }

    public void setStart_latitude(float start_latitude) {
        this.start_latitude = start_latitude;
    }

    public float getEnd_latitude() {
        return end_latitude;
    }

    public void setEnd_latitude(float end_latitude) {
        this.end_latitude = end_latitude;
    }

    public float getStart_longitude() {
        return start_longitude;
    }

    public void setStart_longitude(float start_longitude) {
        this.start_longitude = start_longitude;
    }

    public float getEnd_longitude() {
        return end_longitude;
    }

    public void setEnd_longitude(float end_longitude) {
        this.end_longitude = end_longitude;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }
}

package com.venuefinder.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long placeId;
    private String placeName;
    private String placeDescription;

    private String address;
    private int zipCode;
    private String state;
    private String longitude;
    private String latitude;
    private Long minPrice;
     private Long maxPrice;

    @ColumnDefault("false")
    private Boolean isExpire;

    public Long getMinPrice() {
        return minPrice;
    }
    public Long getPlaceId(){
        return placeId;
    }

    public void setMinPrice(Long minPrice) {
        this.minPrice = minPrice;
    }

    public Long getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Long maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Boolean getExpire() {
        return isExpire;
    }

    public void setExpire(Boolean expire) {
        isExpire = expire;
    }

    public Place(String placeName, String placeDescription, String address, int zipCode, String state, String longitude, String latitude, Boolean isExpire, Long minPrice,Long maxPrice) {
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.address = address;
        this.zipCode = zipCode;
        this.state = state;
        this.longitude = longitude;
        this.latitude = latitude;
        this.isExpire = isExpire;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public Place(){

    }

    @Override
    public String toString() {
        return "Place{" +
                "placeId=" + placeId +
                ", placeName='" + placeName + '\'' +
                ", placeDescription='" + placeDescription + '\'' +
                ", address='" + address + '\'' +
                ", zipCode=" + zipCode +
                ", state='" + state + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", isExpire=" + isExpire +
                '}';
    }
}

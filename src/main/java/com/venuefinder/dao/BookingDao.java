package com.venuefinder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venuefinder.entity.Booking;

public interface BookingDao extends JpaRepository<Booking, Long> {

}

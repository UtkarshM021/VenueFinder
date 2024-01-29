package com.venuefinder.service;

import java.util.List;
import java.util.Optional;

import com.venuefinder.entity.Booking;


public interface BookingService {
	
	public void saveBooking(Booking b);
    public List<Booking> getBookings();
    public Optional<Booking> getBookingById(Long bookingId);

}

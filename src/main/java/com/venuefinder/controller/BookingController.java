package com.venuefinder.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.venuefinder.entity.Booking;
import com.venuefinder.service.BookingService;

public class BookingController {
	
	@Autowired
    public BookingService bookingService ;
	
	@GetMapping("/bookings")
    public List<Booking> getBookings(){
        return bookingService.getBookings();
    }

    @GetMapping("/bookings/{bookingId}")
    public Optional<Booking> getBookingById(@PathVariable Long bookingId){
        return bookingService.getBookingById(bookingId);
    }

    @PostMapping("/booking")
    public void addBooking(@RequestBody Booking booking){
    	bookingService.saveBooking(booking);
    }

}

package com.venuefinder.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venuefinder.dao.BookingDao;
import com.venuefinder.dao.UserDao;
import com.venuefinder.entity.Booking;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
    private BookingDao bookingDao;

	@Override
	public void saveBooking(Booking b) {
		// TODO Auto-generated method stub
		bookingDao.save(b);
		

	}

	@Override
	public List<Booking> getBookings() {
		// TODO Auto-generated method stub
		return bookingDao.findAll();
	}

	@Override
	public Optional<Booking> getBookingById(Long bookingId) {
		// TODO Auto-generated method stub
		return bookingDao.findById(bookingId);
	}

}

package org.processes.cincin.bookingmanagement.seam;

import javax.ejb.Local;

@Local
public interface IBookingManagement {

	void beingBookingManagement();
	String endBookingManagement();
    void destroy();
}
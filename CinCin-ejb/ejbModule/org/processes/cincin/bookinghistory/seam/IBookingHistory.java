package org.processes.cincin.bookinghistory.seam;

import javax.ejb.Local;

@Local
public interface IBookingHistory {

	void beingBookingHistory();
	String endBookingHistory();
    void destroy();
}
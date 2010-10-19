package org.processes.cincin.ticketbooking.seam;

import javax.ejb.Local;

@Local
public interface ITicketBooking {

	void beingTicketBooking();
	String endTicketBooking();
    void destroy();
}
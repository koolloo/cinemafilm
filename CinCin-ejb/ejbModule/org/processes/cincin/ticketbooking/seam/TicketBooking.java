package org.processes.cincin.ticketbooking.seam;

import javax.ejb.Remove;
import javax.ejb.Stateful;

import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.Destroy;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.log.Log;
import org.processes.cincin.ticketbooking.ejb.ITicketBookingManager;

@Stateful
@Name("ticketBooking")
public class TicketBooking implements ITicketBooking
{
    @Logger private Log log;
    
    @In
    ITicketBookingManager ticketBookingManager;
    
    @Begin(join=true)
	public void beingTicketBooking() {
		log.info("Beginning the new converstion [Ticket Booking].");
	}

	@End
	public String endTicketBooking() {
		log.info("Ending the converstion [Ticket Booking].");
		return "/home.xhtml";
	}
	
	@Remove
    @Destroy
    public void destroy() {}
}
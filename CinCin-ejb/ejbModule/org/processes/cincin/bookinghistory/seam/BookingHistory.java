package org.processes.cincin.bookinghistory.seam;

import javax.ejb.Remove;
import javax.ejb.Stateful;

import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.Destroy;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.log.Log;
import org.processes.cincin.bookinghistory.ejb.IBookingHistoryManager;

@Stateful
@Name("bookingHistory")
public class BookingHistory implements IBookingHistory
{
    @Logger private Log log;
    
    @In
    IBookingHistoryManager bookingHistoryManager;
    
    @Begin(join=true)
	public void beingBookingHistory() {
		log.info("Beginning the new converstion [Booking History].");
	}

	@End
	public String endBookingHistory() {
		log.info("Ending the converstion [Booking History].");
		return "/home.xhtml";
	}
	
	@Remove
    @Destroy
    public void destroy() {}
}
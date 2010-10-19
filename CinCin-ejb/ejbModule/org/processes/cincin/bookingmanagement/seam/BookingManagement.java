package org.processes.cincin.bookingmanagement.seam;

import javax.ejb.Remove;
import javax.ejb.Stateful;

import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.Destroy;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.log.Log;
import org.processes.cincin.bookingmanagement.ejb.IBookingManagementManager;

@Stateful
@Name("bookingManagement")
public class BookingManagement implements IBookingManagement
{
    @Logger private Log log;
    
    @In
    IBookingManagementManager bookingManagementManager;
    
    @Begin(join=true)
	public void beingBookingManagement() {
    	log.info("Beginning the new converstion [Booking Management].");
	}

	@End
	public String endBookingManagement() {
		log.info("Ending the converstion [Booking Management].");
		return "/home.xhtml";
	}
	
	@Remove
    @Destroy
    public void destroy() {}
}
package org.processes.cincin.bookingmanagement.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.domain.cincin.entities.UsersCustomers;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.log.Log;
import org.processes.cincin.ticketbooking.ejb.ITicketBookingManager;

@Stateless
@Name("bookingManagementManager")
public class BookingManagementManager implements ITicketBookingManager {

	@Logger private Log log;
	
	@PersistenceContext
	EntityManager em;
	
	@In @Out
	UsersCustomers loggedUser;
}
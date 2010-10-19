package org.domain.cincin.entities;

import java.io.*;
import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name="BOOKINGS")
public class Bookings implements Serializable
{
	private static final long serialVersionUID = -4928486929950098038L;

	protected int id;

	protected Date bookingdate;

	protected int groupnumber;

	protected short confirmed;

	protected Seats seats;

	protected Shows shows;

	protected UsersCustomers usersCustomers;

	/**
	 * Method 'Bookings'
	 * 
	 */
	public Bookings()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return int
	 */
	@Id
	@Column(name="id")
	public int getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * Method 'getBookingdate'
	 * 
	 * @return Date
	 */
	@Column(name="bookingdate")
	public Date getBookingdate()
	{
		return bookingdate;
	}

	/**
	 * Method 'setBookingdate'
	 * 
	 * @param bookingdate
	 */
	public void setBookingdate(Date bookingdate)
	{
		this.bookingdate = bookingdate;
	}

	/**
	 * Method 'getGroupnumber'
	 * 
	 * @return int
	 */
	@Column(name="groupnumber")
	public int getGroupnumber()
	{
		return groupnumber;
	}

	/**
	 * Method 'setGroupnumber'
	 * 
	 * @param groupnumber
	 */
	public void setGroupnumber(int groupnumber)
	{
		this.groupnumber = groupnumber;
	}

	/**
	 * Method 'getConfirmed'
	 * 
	 * @return short
	 */
	@Column(name="confirmed")
	public short getConfirmed()
	{
		return confirmed;
	}

	/**
	 * Method 'setConfirmed'
	 * 
	 * @param confirmed
	 */
	public void setConfirmed(short confirmed)
	{
		this.confirmed = confirmed;
	}

	/**
	 * Method 'getSeats'
	 * 
	 * @return Seats
	 */
	@ManyToOne
	@JoinColumn(name="seatid", insertable=true, updatable=true)
	public Seats getSeats()
	{
		return seats;
	}

	/**
	 * Method 'setSeats'
	 * 
	 * @param seats
	 */
	public void setSeats(Seats seats)
	{
		this.seats = seats;
	}

	/**
	 * Method 'getShows'
	 * 
	 * @return Shows
	 */
	@ManyToOne
	@JoinColumn(name="showid", insertable=true, updatable=true)
	public Shows getShows()
	{
		return shows;
	}

	/**
	 * Method 'setShows'
	 * 
	 * @param shows
	 */
	public void setShows(Shows shows)
	{
		this.shows = shows;
	}

	/**
	 * Method 'getUsersCustomers'
	 * 
	 * @return UsersCustomers
	 */
	@ManyToOne
	@JoinColumn(name="userid", insertable=true, updatable=true)
	public UsersCustomers getUsersCustomers()
	{
		return usersCustomers;
	}

	/**
	 * Method 'setUsersCustomers'
	 * 
	 * @param usersCustomers
	 */
	public void setUsersCustomers(UsersCustomers usersCustomers)
	{
		this.usersCustomers = usersCustomers;
	}

}

package org.domain.cincin.entities;

import java.io.*;
import javax.persistence.*;

@Entity
@Table(name="SEATS")
public class Seats implements Serializable
{
	private static final long serialVersionUID = 6340122644923698580L;

	protected int id;

	protected String row;

	protected String seat;

	protected Showrooms showrooms;

	/**
	 * Method 'Seats'
	 * 
	 */
	public Seats()
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
	 * Method 'getRow'
	 * 
	 * @return String
	 */
	@Column(name="row")
	public String getRow()
	{
		return row;
	}

	/**
	 * Method 'setRow'
	 * 
	 * @param row
	 */
	public void setRow(String row)
	{
		this.row = row;
	}

	/**
	 * Method 'getSeat'
	 * 
	 * @return String
	 */
	@Column(name="seat")
	public String getSeat()
	{
		return seat;
	}

	/**
	 * Method 'setSeat'
	 * 
	 * @param seat
	 */
	public void setSeat(String seat)
	{
		this.seat = seat;
	}

	/**
	 * Method 'getShowrooms'
	 * 
	 * @return Showrooms
	 */
	@ManyToOne
	@JoinColumn(name="showroomid", insertable=true, updatable=true)
	public Showrooms getShowrooms()
	{
		return showrooms;
	}

	/**
	 * Method 'setShowrooms'
	 * 
	 * @param showrooms
	 */
	public void setShowrooms(Showrooms showrooms)
	{
		this.showrooms = showrooms;
	}

}

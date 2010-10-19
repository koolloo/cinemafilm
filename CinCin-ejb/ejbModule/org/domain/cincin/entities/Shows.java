package org.domain.cincin.entities;

import java.io.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="SHOWS")
public class Shows implements Serializable
{
	private static final long serialVersionUID = -941385026916852180L;

	protected int id;

	protected Date date;

	protected String hour;

	protected Movies movies;

	protected Showrooms showrooms;

	/**
	 * Method 'Shows'
	 * 
	 */
	public Shows()
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
	 * Method 'getDate'
	 * 
	 * @return Date
	 */
	@Column(name="date")
	public Date getDate()
	{
		return date;
	}

	/**
	 * Method 'setDate'
	 * 
	 * @param date
	 */
	public void setDate(Date date)
	{
		this.date = date;
	}

	/**
	 * Method 'getHour'
	 * 
	 * @return String
	 */
	@Column(name="hour")
	public String getHour()
	{
		return hour;
	}

	/**
	 * Method 'setHour'
	 * 
	 * @param hour
	 */
	public void setHour(String hour)
	{
		this.hour = hour;
	}

	/**
	 * Method 'getMovies'
	 * 
	 * @return Movies
	 */
	@ManyToOne
	@JoinColumn(name="movieid", insertable=true, updatable=true)
	public Movies getMovies()
	{
		return movies;
	}

	/**
	 * Method 'setMovies'
	 * 
	 * @param movies
	 */
	public void setMovies(Movies movies)
	{
		this.movies = movies;
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

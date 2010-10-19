package org.domain.cincin.entities;

import java.io.*;
import javax.persistence.*;

@Entity
@Table(name="SHOWROOMS")
public class Showrooms implements Serializable
{
	private static final long serialVersionUID = 7413970458933175880L;

	protected int id;

	protected int seatlimit;

	protected String name;

	/**
	 * Method 'Showrooms'
	 * 
	 */
	public Showrooms()
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
	 * Method 'getSeatlimit'
	 * 
	 * @return int
	 */
	@Column(name="seatlimit")
	public int getSeatlimit()
	{
		return seatlimit;
	}

	/**
	 * Method 'setSeatlimit'
	 * 
	 * @param seatlimit
	 */
	public void setSeatlimit(int seatlimit)
	{
		this.seatlimit = seatlimit;
	}

	/**
	 * Method 'getName'
	 * 
	 * @return String
	 */
	@Column(name="name")
	public String getName()
	{
		return name;
	}

	/**
	 * Method 'setName'
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

}

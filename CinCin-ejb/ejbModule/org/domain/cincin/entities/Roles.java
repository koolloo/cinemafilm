package org.domain.cincin.entities;

import java.io.*;
import javax.persistence.*;

@Entity
@Table(name="ROLES")
public class Roles implements Serializable
{
	private static final long serialVersionUID = 1467987618080644228L;

	protected int id;

	protected String name;

	/**
	 * Method 'Roles'
	 * 
	 */
	public Roles()
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

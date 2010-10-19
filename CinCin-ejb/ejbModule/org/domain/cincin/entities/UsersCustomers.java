package org.domain.cincin.entities;

import java.io.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="USERS_CUSTOMERS")
public class UsersCustomers implements Serializable
{
	private static final long serialVersionUID = 7984227782207894616L;

	protected int id;

	protected String firstname;

	protected String lastname;

	protected String phonenumber;

	protected Date dayofbirth;

	protected Date joiningdate;

	protected String userlogin;

	protected String userpassword;

	protected String emailaddress;

	protected String city;

	protected String userphoto;

	protected Roles roles;

	/**
	 * Method 'UsersCustomers'
	 * 
	 */
	public UsersCustomers()
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
	 * Method 'getFirstname'
	 * 
	 * @return String
	 */
	@Column(name="firstname")
	public String getFirstname()
	{
		return firstname;
	}

	/**
	 * Method 'setFirstname'
	 * 
	 * @param firstname
	 */
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	/**
	 * Method 'getLastname'
	 * 
	 * @return String
	 */
	@Column(name="lastname")
	public String getLastname()
	{
		return lastname;
	}

	/**
	 * Method 'setLastname'
	 * 
	 * @param lastname
	 */
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	/**
	 * Method 'getPhonenumber'
	 * 
	 * @return String
	 */
	@Column(name="phonenumber")
	public String getPhonenumber()
	{
		return phonenumber;
	}

	/**
	 * Method 'setPhonenumber'
	 * 
	 * @param phonenumber
	 */
	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}

	/**
	 * Method 'getDayofbirth'
	 * 
	 * @return Date
	 */
	@Column(name="dayofbirth")
	public Date getDayofbirth()
	{
		return dayofbirth;
	}

	/**
	 * Method 'setDayofbirth'
	 * 
	 * @param dayofbirth
	 */
	public void setDayofbirth(Date dayofbirth)
	{
		this.dayofbirth = dayofbirth;
	}

	/**
	 * Method 'getJoiningdate'
	 * 
	 * @return Date
	 */
	@Column(name="joiningdate")
	public Date getJoiningdate()
	{
		return joiningdate;
	}

	/**
	 * Method 'setJoiningdate'
	 * 
	 * @param joiningdate
	 */
	public void setJoiningdate(Date joiningdate)
	{
		this.joiningdate = joiningdate;
	}

	/**
	 * Method 'getUserlogin'
	 * 
	 * @return String
	 */
	@Column(name="userlogin")
	public String getUserlogin()
	{
		return userlogin;
	}

	/**
	 * Method 'setUserlogin'
	 * 
	 * @param userlogin
	 */
	public void setUserlogin(String userlogin)
	{
		this.userlogin = userlogin;
	}

	/**
	 * Method 'getUserpassword'
	 * 
	 * @return String
	 */
	@Column(name="userpassword")
	public String getUserpassword()
	{
		return userpassword;
	}

	/**
	 * Method 'setUserpassword'
	 * 
	 * @param userpassword
	 */
	public void setUserpassword(String userpassword)
	{
		this.userpassword = userpassword;
	}

	/**
	 * Method 'getEmailaddress'
	 * 
	 * @return String
	 */
	@Column(name="emailaddress")
	public String getEmailaddress()
	{
		return emailaddress;
	}

	/**
	 * Method 'setEmailaddress'
	 * 
	 * @param emailaddress
	 */
	public void setEmailaddress(String emailaddress)
	{
		this.emailaddress = emailaddress;
	}

	/**
	 * Method 'getCity'
	 * 
	 * @return String
	 */
	@Column(name="city")
	public String getCity()
	{
		return city;
	}

	/**
	 * Method 'setCity'
	 * 
	 * @param city
	 */
	public void setCity(String city)
	{
		this.city = city;
	}

	/**
	 * Method 'getUserphoto'
	 * 
	 * @return String
	 */
	@Column(name="userphoto")
	public String getUserphoto()
	{
		return userphoto;
	}

	/**
	 * Method 'setUserphoto'
	 * 
	 * @param userphoto
	 */
	public void setUserphoto(String userphoto)
	{
		this.userphoto = userphoto;
	}

	/**
	 * Method 'getRoles'
	 * 
	 * @return Roles
	 */
	@ManyToOne
	@JoinColumn(name="roleid", insertable=true, updatable=true)
	public Roles getRoles()
	{
		return roles;
	}

	/**
	 * Method 'setRoles'
	 * 
	 * @param roles
	 */
	public void setRoles(Roles roles)
	{
		this.roles = roles;
	}

}

package org.domain.cincin.entities;

import java.io.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="MOVIES")
public class Movies implements Serializable
{
	private static final long serialVersionUID = -1738929927705263007L;

	protected int id;

	protected String title;

	protected String description;

	protected String diretor;

	protected int duration;

	protected Date dateofrelase;

	protected int pegi;

	protected String type;

	protected String scriptwriter;

	protected String outerlink;

	protected String otherinfo;

	protected String photo;

	protected String photos;

	/**
	 * Method 'Movies'
	 * 
	 */
	public Movies()
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
	 * Method 'getTitle'
	 * 
	 * @return String
	 */
	@Column(name="title")
	public String getTitle()
	{
		return title;
	}

	/**
	 * Method 'setTitle'
	 * 
	 * @param title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * Method 'getDescription'
	 * 
	 * @return String
	 */
	@Column(name="description")
	public String getDescription()
	{
		return description;
	}

	/**
	 * Method 'setDescription'
	 * 
	 * @param description
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * Method 'getDiretor'
	 * 
	 * @return String
	 */
	@Column(name="diretor")
	public String getDiretor()
	{
		return diretor;
	}

	/**
	 * Method 'setDiretor'
	 * 
	 * @param diretor
	 */
	public void setDiretor(String diretor)
	{
		this.diretor = diretor;
	}

	/**
	 * Method 'getDuration'
	 * 
	 * @return int
	 */
	@Column(name="duration")
	public int getDuration()
	{
		return duration;
	}

	/**
	 * Method 'setDuration'
	 * 
	 * @param duration
	 */
	public void setDuration(int duration)
	{
		this.duration = duration;
	}

	/**
	 * Method 'getDateofrelase'
	 * 
	 * @return Date
	 */
	@Column(name="dateofrelase")
	public Date getDateofrelase()
	{
		return dateofrelase;
	}

	/**
	 * Method 'setDateofrelase'
	 * 
	 * @param dateofrelase
	 */
	public void setDateofrelase(Date dateofrelase)
	{
		this.dateofrelase = dateofrelase;
	}

	/**
	 * Method 'getPegi'
	 * 
	 * @return int
	 */
	@Column(name="pegi")
	public int getPegi()
	{
		return pegi;
	}

	/**
	 * Method 'setPegi'
	 * 
	 * @param pegi
	 */
	public void setPegi(int pegi)
	{
		this.pegi = pegi;
	}

	/**
	 * Method 'getType'
	 * 
	 * @return String
	 */
	@Column(name="type")
	public String getType()
	{
		return type;
	}

	/**
	 * Method 'setType'
	 * 
	 * @param type
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/**
	 * Method 'getScriptwriter'
	 * 
	 * @return String
	 */
	@Column(name="scriptwriter")
	public String getScriptwriter()
	{
		return scriptwriter;
	}

	/**
	 * Method 'setScriptwriter'
	 * 
	 * @param scriptwriter
	 */
	public void setScriptwriter(String scriptwriter)
	{
		this.scriptwriter = scriptwriter;
	}

	/**
	 * Method 'getOuterlink'
	 * 
	 * @return String
	 */
	@Column(name="outerlink")
	public String getOuterlink()
	{
		return outerlink;
	}

	/**
	 * Method 'setOuterlink'
	 * 
	 * @param outerlink
	 */
	public void setOuterlink(String outerlink)
	{
		this.outerlink = outerlink;
	}

	/**
	 * Method 'getOtherinfo'
	 * 
	 * @return String
	 */
	@Column(name="otherinfo")
	public String getOtherinfo()
	{
		return otherinfo;
	}

	/**
	 * Method 'setOtherinfo'
	 * 
	 * @param otherinfo
	 */
	public void setOtherinfo(String otherinfo)
	{
		this.otherinfo = otherinfo;
	}

	/**
	 * Method 'getPhoto'
	 * 
	 * @return String
	 */
	@Column(name="photo")
	public String getPhoto()
	{
		return photo;
	}

	/**
	 * Method 'setPhoto'
	 * 
	 * @param photo
	 */
	public void setPhoto(String photo)
	{
		this.photo = photo;
	}

	/**
	 * Method 'getPhotos'
	 * 
	 * @return String
	 */
	@Column(name="photos")
	public String getPhotos()
	{
		return photos;
	}

	/**
	 * Method 'setPhotos'
	 * 
	 * @param photos
	 */
	public void setPhotos(String photos)
	{
		this.photos = photos;
	}

}

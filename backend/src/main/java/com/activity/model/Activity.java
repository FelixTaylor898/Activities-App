package com.activity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
@Entity
public class Activity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private Date dateAdded;
	private String name;
	private String description;
	private int likes;
	
	public Activity() {
		super();
	}
	
	@Override
	public String toString() {
		return "Activity [id=" + id + ", dateAdded=" + dateAdded + ", name=" + name + ", description=" + description
				+ ", likes=" + likes + ", participated=" + participated + ", outdoors=" + outdoors + "]";
	}

	private int participated;
	private boolean outdoors;
	public String getName() {
		return name;
	}
	
	
	
	public Activity(String name, String description, int likes, int participated, boolean outdoors) {
		super();
		this.dateAdded = new Date(System.currentTimeMillis());
		this.name = name;
		this.description = description;
		this.likes = likes;
		this.participated = participated;
		this.outdoors = outdoors;
	}



	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getParticipated() {
		return participated;
	}
	public void setParticipated(int participated) {
		this.participated = participated;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public boolean isOutdoors() {
		return outdoors;
	}



	public void setOutdoors(boolean outdoors) {
		this.outdoors = outdoors;
	}
}
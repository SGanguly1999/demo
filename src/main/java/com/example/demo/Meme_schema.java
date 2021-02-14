package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Meme_schema {
	
	@Id
	private int id;
	@Override
	public String toString() {
		return "Meme_schema [id=" + id + ", owner=" + owner + ", caption=" + caption + ", url=" + url + "]";
	}
	private String owner;
	private String caption;
	
	@Column(length=10000)
	private String url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}

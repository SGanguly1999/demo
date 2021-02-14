package com.example.demo;

import org.springframework.stereotype.Component;

public class Alien {
	private String owner;
	private String caption;
	private String url;
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
	@Override
	public String toString() {
		return "Alien [owner=" + owner + ", caption=" + caption + ", url=" + url + "]";
	}
	

}

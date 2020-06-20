package com.fireworks.portfolio.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "blog")
public class Blog {
	@Id
	public ObjectId _id;
	public String title;
	public String short_desc;
	public String content;
	
	//Constructor
	public Blog(ObjectId _id, String title, String short_desc, String content) {
		this._id = _id;
		this.title = title;
		this.short_desc = short_desc;
		this.content = content;
	}
	
	//Setters
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setShort_desc(String short_desc) {
		this.short_desc = short_desc;
	}
	public void setContent(String content) {
		this.title = content;
	}
}

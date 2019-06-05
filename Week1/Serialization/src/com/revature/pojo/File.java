package com.revature.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class File implements Serializable {
	
	private String name;
	
	private LocalDateTime dateCreated;
	
	private LocalDateTime dateLastEdited;
	
	private String owner;
	
	private String content;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDateTime getDateLastEdited() {
		return dateLastEdited;
	}

	public void setDateLastEdited(LocalDateTime dateLastEdited) {
		this.dateLastEdited = dateLastEdited;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public File(String name, LocalDateTime dateCreated, LocalDateTime dateLastEdited, String owner, String content) {
		super();
		this.name = name;
		this.dateCreated = dateCreated;
		this.dateLastEdited = dateLastEdited;
		this.owner = owner;
		this.content = content;
	}

	public File() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "File [name=" + name + ", dateCreated=" + dateCreated + ", dateLastEdited=" + dateLastEdited + ", owner="
				+ owner + ", content=" + content + "]";
	}
	
}

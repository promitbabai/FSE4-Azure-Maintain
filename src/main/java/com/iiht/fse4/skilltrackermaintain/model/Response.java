package com.iiht.fse4.skilltrackermaintain.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {

	public int status;
	public String message;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

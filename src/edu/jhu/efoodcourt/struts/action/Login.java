package edu.jhu.efoodcourt.struts.action;

import com.opensymphony.xwork2.ActionSupport;

import edu.jhu.efoodcourt.struts.model.UserDAO;
import edu.jhu.efoodcourt.struts.model.Users;

public class Login extends ActionSupport {
	
	private Users user;
	
	private String message;
	
	public String execute() throws Exception {
		
		UserDAO userDao = new UserDAO();
		boolean isRegistered = userDao.isRegistered(user.getName(), user.getPassword());
		
		if(isRegistered) return SUCCESS;
		else return ERROR;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

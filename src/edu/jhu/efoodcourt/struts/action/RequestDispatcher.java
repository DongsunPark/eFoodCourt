package edu.jhu.efoodcourt.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class RequestDispatcher extends ActionSupport {

	private static final long serialVersionUID = 1L;

	String nextTiles;

	@Override
	public String execute() throws Exception {

		
		// get a parameter of request for name of definition
		// go to tiles page using url with "gotoTile"parameter
		return "gotoTiles";
	}

	public String getNextTiles() {
		return nextTiles;
	}

	public void setNextTiles(String nextTiles) {
		this.nextTiles = nextTiles;
	}


}
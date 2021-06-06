package org.eu5.learn_pisio.jsf.page;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 * Welcome Page
 * Short-Lived Managed Bean / per Request
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 7:37 PM June 6, 2021
 * description
 * This scope is ideal for pages that will display static information, or even
 * a page that displays some dynamic data, but doesn't have too much back and
 * forth between the user and the server.
 */
@Named("welcomePageBean")
@RequestScoped
public class WelcomePageBean {
	
	private String welcomeUserName;
	private String completedGreeting;

	/**
	 * @return the welcomeUserName
	 */
	public String getWelcomeUserName() {
		return welcomeUserName;
	}

	/**
	 * @param welcomeUserName the welcomeUserName to set
	 */
	public void setWelcomeUserName(String welcomeUserName) {
		this.welcomeUserName = welcomeUserName;
	}

	/**
	 * @return the completedGreeting
	 */
	public String getCompletedGreeting() {
		return completedGreeting;
	}

	/**
	 * @param completedGreeting the completedGreeting to set
	 */
	public void setCompletedGreeting(String completedGreeting) {
		this.completedGreeting = completedGreeting;
	}
	
	public void sayHello() {
		completedGreeting = "Hello, " + welcomeUserName;
	}
	
	public String navigateToFlashPage() {
		FacesContext.getCurrentInstance()
				.getExternalContext()
				.getFlash()
				.put("transmittedVariable", welcomeUserName + " sent this!");
		// return name of the page that we want to navigate to
		return "flashscope.xhtml";
	}
}

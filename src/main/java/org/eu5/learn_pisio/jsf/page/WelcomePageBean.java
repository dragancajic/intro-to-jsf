package org.eu5.learn_pisio.jsf.page;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Welcome Page
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 7:37 PM June 6, 2021
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
}

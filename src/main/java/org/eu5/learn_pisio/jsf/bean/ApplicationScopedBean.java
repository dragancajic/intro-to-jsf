package org.eu5.learn_pisio.jsf.bean;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Long-Lived Managed Bean / per Application
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 11:54 PM June 6, 2021
 * @description
 * Only one instance of this backing bean will exist inside the entire application.
 */
@Named("applicationScopedBean")
@ApplicationScoped
public class ApplicationScopedBean {
	
}

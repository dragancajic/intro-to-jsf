package org.eu5.learn_pisio.jsf.bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * Long-Lived Managed Bean / per Browser-HTTP Session
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 12:05 AM June 7, 2021
 * @description
 * All session scoped beans must implement Serializable interface.
 * Only one instance of this bean is possible to exist in a given HTTP session.
 */
@Named("sessionScopedBean")
@SessionScoped
public class SessionScopedBean implements Serializable {
	
}

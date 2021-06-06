package org.eu5.learn_pisio.jsf.bean;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 * Short-Lived Managed Bean
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 12:26 AM June 7, 2021
 * @description
 * This scope was created as an intermediate bean lifespan between the session
 * scope and the request scope. Implements Serializable interface. This bean is
 * a perfect fit for any JSF page that engages the user in conversational way,
 * especially with Ajax.
 */
@Named("viewScopedBean")
@ViewScoped
public class ViewScopedBean implements Serializable {
	
}

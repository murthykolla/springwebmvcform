package com.ibm.config;
import javax.servlet.*;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebInitilizer implements WebApplicationInitializer{
public void onStartup(ServletContext servletContext) throws ServletException{
	AnnotationConfigWebApplicationContext container=new AnnotationConfigWebApplicationContext();
	container.register(SpringWebConfiguration.class);
	container.setServletContext(servletContext);
	Dynamic servlet =servletContext.addServlet("spring", new DispatcherServlet(container));
	servlet.addMapping("/");
	servlet.setLoadOnStartup(3);
	
	
}
}

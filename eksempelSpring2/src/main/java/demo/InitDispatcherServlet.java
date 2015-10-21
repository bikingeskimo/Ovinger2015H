package demo;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class InitDispatcherServlet implements WebApplicationInitializer {

	    @Override
	    public void onStartup(final ServletContext servletContext) throws ServletException {
	        registerDispatcherServlet(servletContext);
	    }
	    
	    private void registerDispatcherServlet(final ServletContext servletContext) {
	    	AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
	        context.register(EksempelKonfig.class);
	        
	        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
	        
	        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", dispatcherServlet);
	        dispatcher.setLoadOnStartup(1);
	        dispatcher.addMapping("/");
	    }
}


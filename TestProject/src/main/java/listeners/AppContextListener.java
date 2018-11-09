package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import models.Message;
import util.LogingHelper;

public class AppContextListener implements ServletContextListener
{

	@Override
	public void contextDestroyed(ServletContextEvent arg0)
	{
		LogingHelper.log("Destroying the application context");
	}

	@Override
	public void contextInitialized(ServletContextEvent event)
	{
		LogingHelper.log("Constructing the application context\nCreating a Message and setting it as an appliaction level attribute");
		Message message =new Message("This is a message generated in the listener",5);
		
		ServletContext context=event.getServletContext();
		context.setAttribute("listenerMessage", message);
		
		message=new Message("This is a dynamic ContextParam",1);
		
		context.setInitParameter("dynamicParam", message.toString());
		
		LogingHelper.log("Message created and set in the application attribute");
	}

}

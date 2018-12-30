package listeners;

import java.util.Enumeration;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import util.LogingHelper;

public class AppSessionListener implements HttpSessionListener
{

	@Override
	public void sessionCreated(HttpSessionEvent se)
	{
		LogingHelper.log("Session created "+se.getSession().getId());
		HttpSession currentSession = se.getSession();
		Enumeration<String> sessionAttributes = currentSession.getAttributeNames();
		Object sessionAttrValue = null;
		String name = null;

		while (sessionAttributes.hasMoreElements()) {
			name = sessionAttributes.nextElement();
			sessionAttrValue = currentSession.getAttribute(name);
			LogingHelper.log("Generated Session Attribute : (" + name + " : " + sessionAttrValue + ")");
		}
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se)
	{
		LogingHelper.log("Session destroyed "+se.getSession().getId());		
	}
}

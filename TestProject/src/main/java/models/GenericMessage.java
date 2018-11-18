package models;

import java.io.Serializable;

public abstract class GenericMessage implements Serializable
{
	public String content="Content not set";
	public int priority;
	
	public String getContent()
	{
		if(content==null||content.equals(""))
			return "Content not set";
		else
			return content;
	}
	public int getPriority()
	{
		return priority;
	}
}

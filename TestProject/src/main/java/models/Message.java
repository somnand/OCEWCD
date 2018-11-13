package models;

import java.io.Serializable;

import util.LogingHelper;

public class Message implements Serializable
{
	private String content;
	private int priority;

	public Message()
	{
		LogingHelper.log("Blank constructor is called for Message class");
	}
		
	public Message(String content, int priority)
	{
		super();
		this.content = content;
		this.priority = priority;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public int getPriority()
	{
		return priority;
	}

	public void setPriority(int priority)
	{
		this.priority = priority;
	}

	@Override
	public String toString()
	{
		return "[content=" + content + ", priority=" + priority + "]";
	}
	
}

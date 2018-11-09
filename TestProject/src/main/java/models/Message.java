package models;

import java.io.Serializable;

public class Message implements Serializable
{
	private String content;
	private int priority;

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

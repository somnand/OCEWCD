package models;

import util.LogingHelper;

public class Message extends GenericMessage
{
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
	
	public void setContent(String content)
	{
		this.content = content;
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

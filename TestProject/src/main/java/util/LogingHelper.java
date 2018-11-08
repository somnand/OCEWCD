package util;

import java.util.Date;

/**Cross cutting logging helper */
public final class LogingHelper 
{
	public static void log(String msg)
	{
		Thread current=Thread.currentThread();
		Date now=new Date();
		System.out.println(current.toString()+"@"+now.toString()+" : "+msg);
	}
}

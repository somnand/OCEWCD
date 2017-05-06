package service;

public class AuthenticationService 
{
	public boolean authenticate(String userId,String password)
	{
		if(userId==null||password==null)
			return false;
		else		
			return true;
	}
}

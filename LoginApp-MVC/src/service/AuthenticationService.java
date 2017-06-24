package service;

public class AuthenticationService 
{
	/**
	 * Used to authenticate the User ID and password captured from screen
	 * @param userId
	 * @param password
	 * @return whether the userid is valid or not
	 */
	public boolean authenticate(String userId,String password)
	{
		if(userId==null||password==null||userId.trim().equals("")||password.trim().equals(""))
			return false;
		else		
			return true;
	}
}

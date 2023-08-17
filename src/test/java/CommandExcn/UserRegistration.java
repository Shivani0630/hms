package CommandExcn;

import org.testng.annotations.Test;

public class UserRegistration {
	@Test(groups = "Smoke")
	public void UserRigister()
	{
		System.out.println("----succesfull(1)-------");
	}
	@Test(groups = "regression")
	public void UserLogin()
	{
		System.out.println("----succesfully Loggedin to UserLogin-------");
	}
	@Test(groups = "regression")
	public void UserLogout()
	{
		System.out.println("----succesfully Loggedin to UserLogin-------");
	}

}

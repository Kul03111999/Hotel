package org.hotel.project;
import org.junit.Before;
import org.junit.Test;

public class HotelProjectExe extends BaseClass{
	
	@Before
	public void name() {
		driver.get("https://adactinhotelapp.com/");
	}
	
	@Test
	public void Test1() {
		LoginRepo repo = new LoginRepo();
		typedata(repo.getUsername(), "kul");
		typedata(repo.getPassword(), "1");
		
	}

	
	
}

package testNG;

import org.testng.annotations.Test;

public class GroupingExample {

	/*we have 1 basket there group of mobile phones are available which include moto,vivo,samsung,apple and we have to 
	 * test vivo and moto alone without testing apple and samsung*/
	@Test(groups = "moto")
	public void motog2() {
		System.out.println("motog2 tested");
	}
	
	@Test(groups = "moto")
	public void motog3() {
		System.out.println("motog3 tested");
	}
	
	@Test(groups = "vivo")
	public void vivoT2() {
		System.out.println("vivoT2 tested");
	}
	
	@Test(groups = "vivo")
	public void vivoT2pro() {
		System.out.println("vivoT2pro tested");
	}
	
	@Test(groups = "samsung")
	public void samsungs2() {
		System.out.println("samsungs2 tested");
	}
	
	@Test(groups = "samsung")
	public void samsungs2ultra() {
		System.out.println("samsungs2ultra tested");
	}
	
	@Test(groups = "apple")
	public void iphone14() {
		System.out.println("iphone14 tested");
	}
	
	@Test(groups = "apple")
	public void iphone15() {
		System.out.println("iphone15 tested");
	}
}

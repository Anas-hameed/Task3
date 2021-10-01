package quiz;
import java.lang.Exception;

import static org.junit.Assert.*;
import org.junit.Test;


public class Hoteltest {
	
	// Adding functionality test
	// return -1 on unsuccessful addition
	// return room Number on successful addition
	@Test
	public void AddroomTest() {
		Hotel hot= new Hotel();
		int check= hot.Addroom("Anas");
		assertTrue(check!=-1);
	}
	
	// Checking the thrown exception 
	// Exception test on finding guest out of bound
	@Test(expected=Exception.class) 
	public void FindGuesTestA() throws Exception{	
		Hotel hot= new Hotel();
		hot.Addroom("Anas");
		hot.Addroom("Sham");
		hot.FindCustomer(500);
		
	}
	
	// Finding the guest functionality test
	// Booking the room and finding them using find function
	@Test
	public void FindGuestTestB() throws Exception{
		Hotel hot= new Hotel();
		int key1= hot.Addroom("Anas");
		int key2= hot.Addroom("Sham");
		String Expected1="Anas";
		String Expected2="Sham";
		assertEquals(Expected1, hot.FindCustomer(key1));
		assertEquals(Expected2, hot.FindCustomer(key2));
	}
	
	// Data saving test
	@Test 
	public void saveDataTest() {
		Hotel hot= new Hotel();
		hot.Addroom("Anas");
		hot.Addroom("Sham");
		boolean check= hot.saveData();
		assertTrue(check);
	}	
	
	@Test 
	public void saveDataExceptionTest() {
		Hotel hot= new Hotel();
		hot.Addroom("Anas");
		hot.Addroom("Sham");
		boolean check= hot.saveData();
		assertTrue(check);
	}	
}

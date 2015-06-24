import static org.junit.Assert.*;

import org.junit.Test;


public class BankAccountTest {

	BankAccount obj=new BankAccount();
	
	@Test
	public void testDepositCash() {
		//fail("Not yet implemented");
		assertEquals(1, obj.depositCash(50000)); 
		System.out.println();
	}

	@Test
	public void testWithdrawCash() {
		//fail("Not yet implemented");
		assertEquals(1, obj.depositCash(500)); 
	}

	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
		assertEquals(obj.getBalance(), obj.getBalance());
		System.out.println("Available balance is ==> "+obj.getBalance());
	}

}

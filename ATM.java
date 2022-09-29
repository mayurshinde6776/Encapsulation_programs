//ATM program
package Encapsulation;

 class ATM {
	private String bank;
	private double balance;
	private String location;
	private String type;
	private int slno;
	

ATM()
{
	
}
ATM(String bank, double balance,String location, int slno, String type)
{
	this.bank=bank;
	this.balance=balance;
	this.location=location;
	this.slno=slno;
	this.type=type;
	
}
public String getBank()
{
	return bank;
}
public double getBalance(long acno,int pin)
{ 
		long actualAcNo=7887560505l;
		int pass=1234;
		
		if(actualAcNo==acno && pass==pin)
		{
			System.out.println("login success!");
			return balance;
	}
		else {
			
		
			System.out.println("Invalid account details");
			return 0;
		}
		}
		
		public void setBalance(long acno, int pin, int amount)
		{
			long actualAcNo=7887560505l;
			int pass=1234;
			
			if(actualAcNo==acno && pass==pin)
			{
				if(amount<=balance)
				{
					balance=balance-amount;
					System.out.println("withdraw successfully!");
					System.out.println("balance" +balance);
					
				}
				else {
					System.out.println("Insufficiant amount");
					
				}
			}
				else {
					System.out.println("Invalid login credentials");
					
				}
		}
			public String getLocation()
			{
				return location;
				
			}
			public String getType()
			{
				return type;
			}
		}

//============================================================================

public class ATMDriver {

public static void main(String[] args)
{
	ATM a1=new ATM("SBI",20000.00,"Deccan",101,"cdm");
	
	System.out.println(a1.getBalance(7887560505l,1234));
	
	a1.setBalance(7887560505l, 1234, 10000);
	
	a1.setBalance(7887560505l, 1234, 5000);
}
}

	


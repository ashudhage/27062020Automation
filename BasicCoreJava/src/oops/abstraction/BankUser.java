package oops.abstraction;

public class BankUser
{
	public static void main(String[] args)
	{
		account(new SBIBank()); // chrome
		account(new HDFCBank()); // firefox
		account(new ICICIBank()); //safari
		System.out.println();
	}

	
	public static void account(RBI bank) // RBI==webdriver 
	{
		bank.creaditCard(); // navigate
		bank.currentAccount(); // click
		bank.debitCard(); // Enter data
		bank.savingAccount(); //select option
	} 
}	
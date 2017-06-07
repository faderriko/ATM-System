public class BalanceInquiry extends Transaction
{
	public BalanceInquiry (int userAccountNumber,BankDatabase atmBankDatabase,Screen atmScreen)
	{
		super (userAccountNumber,atmBankDatabase,atmScreen);
			
	}
	
	@Override
	public void execute()
	{
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		
		double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());
		
		double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());
		
		screen.displayMessageLine("\nBalance information:");
		screen.displayMessage("- Available Balance:");
		screen.displayDollarAmount(totalBalance);
		screen.displayMessageLine("");
	}
}
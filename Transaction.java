public abstract class Transaction
{
	private int accountNumber;
	private BankDatabase bankDatabase;
	private Screen screen;
	
	
	public Transaction(int userAccountNumber,BankDatabase atmBankDatabase,Screen atmScreen)
	{
		accountNumber = userAccountNumber;
		bankDatabase = atmBankDatabase;
		screen = atmScreen;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public Screen getScreen()
	{
		return screen;
	}
	
	public BankDatabase getBankDatabase()
	{
		return bankDatabase;
	}
	
	abstract public void execute();
		
	
}
import java.util.Scanner;

class Accounts{
	protected float balance;
	protected String accountnumber, accountHoldersName, address;
	void Withdrawl(float wdr_money) {
		balance = balance - wdr_money;
		}
	void deposit(float add_money) {
		balance = balance + add_money;
		}
	float display() {
		return balance;
	}
}
class SavingsAccount extends Accounts{
	
	protected float rateOfInterest;
	void CalculateBalance() {
		balance = balance + balance * (rateOfInterest/100);
	}
}
public class AccountMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
		SavingsAccount sa = new SavingsAccount();
		System.out.println("Enter the account number");
		sa.accountnumber = s.nextLine();
		System.out.println("Enter the account holders name");
		sa.accountHoldersName = s.nextLine();
		System.out.println("Enter the address");
		sa.address = s.nextLine();
		System.out.println("Enter the balance");
		sa.balance = s.nextFloat();
			System.out.println("Enter 1 to deposit " + "or enter 2 to withdraw money");
			int c = s.nextInt();
			if(c == 1) {
				System.out.println("Enter the money to deposit");
				float add_money = s.nextFloat();
				sa.deposit(add_money);
			}
			else if (c == 2) {
				System.out.println("Enter the money to withdraw");
				float wdr_money = s.nextFloat();
				sa.Withdrawl(wdr_money);	
			}
		System.out.println("Enter the rate of Interest");
		sa.rateOfInterest = s.nextFloat();
		sa.CalculateBalance();
		System.out.println("your balance is "+sa.display());
			
			
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
package oopsdemo3;

public class SavingsAccount extends Account{
	
	double interestRate;

	public SavingsAccount(String name, double balance, double i) {
		super(name, balance);
		this.interestRate=i;
	}
}

class CheckingAccount extends Account
{

	double overDraft;
	
	public CheckingAccount(String name, double balance,double od) {
		super(name, balance);
		this.overDraft=od;
	}
	
	void withdraw(double amt) {
        System.out.println("Overdraft Amount: " + overDraft);
           if (amt <= balance) {
              balance -= amt;
              System.out.println("Withdrawing: " + amt);
            } else if ((amt > balance) && (amt > (balance + overDraft))) {
               System.out.println("Sorry! You cannot withdraw");
            } else {
               double result = amt - balance;
               overDraft -= result;
               balance = 0;

 

               System.out.println("Withdrawing: " + amt);
               System.out.println("Current Overdraft Amount: "
               + overDraft);
    }

	}
	
	
}	

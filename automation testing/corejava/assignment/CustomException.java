package assignment;

import java.util.Scanner;

//import com.exe.ATM;
//import com.exe.SapnaException;


class CustomException extends Exception
{
	
	  double amount;
	  public CustomException(double amount) 
	  {
		  this.amount=amount;
	  }
  }
class Bank
{
	double balance;
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println(amount+"Rs deposited...");
	}
	public void withdrawal(double amount)throws CustomException
	{
		if(amount<=balance)
		{
			balance=balance=amount;
			System.out.println(amount+"Rs withdrawal success..");
		}
		else
		{
			double needs=amount-balance;
			throw new CustomException(needs);
		}
	}
	public class CustomExp
	{
		public static void main(String[] args) 
		{
			Bank a1=new Bank();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter amount for deposit..");
			double amount=sc.nextDouble();
			a1.deposit(amount);
			System.out.println("Enter amount for withdrawal..");
			amount=sc.nextDouble();
			try
			{ 
				a1.withdrawal(amount);
			}
			catch(CustomException e)
			{
				System.out.println("if the enter"+e.amount+"rs more into your account");
			}
		}
	}
}

package mathpal;

import java.util.Scanner;

public class CurrencyConverter {
	
	CurrencyConverter(){
		
	}
 
	Scanner sc = new Scanner(System.in);
	double amount=0.0;
	
	double TakaToDollar(double amount)
	{
		//1 taka = 0.012 usd
		if(amount<0)
			return -1;
		
		return amount*0.012;
	}
	
	double DollarToTaka(double amount)
	{
		//1 dollar = 84.67 taka
		if(amount<0)
			return -1;
		
		return amount*84.67;
	}
	
	double TakaToCanadianDollar(double amount)
	{
		//1 taka = 0.016 usd
		if(amount<0)
			return -1;
		
		return amount*0.016;
	}
	
	double CanadianDollarToTaka(double amount)
	{
		//1 cd dollar = 64.13 taka
		if(amount<0)
			return -1;
		return amount*64.13;
	}
	
	double TakaToRupee(double amount)
	{
		//1 taka = 0.85 rupee
		if(amount<0)
			return -1;
		return amount*0.85;
	}
	
	double RupeeToTaka(double amount)
	{
		//1 rupee = 1.18 taka
		if(amount<0)
			return -1;
		
		return amount*1.18;
	}
	
	
	void chooseCalc()
	{
		System.out.println("Want to Convert\n 1. Taka to US Dollar \n 2. US Dollar to taka\n"
					+ " 3. Taka to Canadian Dollar\n 4. Canadian Dollar to taka\n "
					+ "5. Taka to Indian Rupee \n + 6. Indian Rupee to taka");
			
		int choice = sc.nextInt();
			
		if(choice == 1)
		{
			System.out.println("Enter amount in Taka:");
			amount=sc.nextDouble();
			System.out.println(amount+" Taka equals to "+TakaToDollar(amount)+"US Dollar\n");
		}
			
		else if(choice ==2)
		{
			System.out.println("Enter amount in Dollar:");
			amount=sc.nextDouble();
			System.out.println(amount+" Dollar equals to "+DollarToTaka(amount)+"Taka\n");
		}
		
		else if(choice ==3)
		{
			System.out.println("Enter amount in Taka:");
			amount=sc.nextDouble();
			System.out.println(amount+" Taka equals to "+TakaToCanadianDollar(amount)+"Canadian Dollar\n");
		}
		
		else if(choice ==4)
		{
			System.out.println("Enter amount in Canadian Dollar:");
			amount=sc.nextDouble();
			System.out.println(amount+" Canadian Dollar equals to "+CanadianDollarToTaka(amount)+"Taka\n");
		}
		
		else if(choice ==5)
		{
			System.out.println("Enter amount in Taka:");
			amount=sc.nextDouble();
			System.out.println(amount+" Taka equals to "+TakaToRupee(amount)+"Indian Rupee\n");
		}
		
		else if(choice ==6)
		{
			System.out.println("Enter amount in Indian Rupee:");
			amount=sc.nextDouble();
			System.out.println(amount+" Indian Rupee equals to "+RupeeToTaka(amount)+"Taka\n");
		}
	 
	}
}
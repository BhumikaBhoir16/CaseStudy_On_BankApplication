package com.Framework;

public abstract class CurrentAcc extends BankAcc {
	
	private static final float creditLimited = 250.00f;
	
	//constructor
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimited) {
		super(accNo, accNm, accBal);
		
	}

	public static float getCreditlimited()
	{
		return creditLimited;
	}
	
	//methods

	@Override
	public void withdraw(float withdraw)
	{
		System.out.println("Account No: "+ getAccNo()+"\n"+"Account Name: "+ getAccNm()+"\n"+"Amount of money withdraw: "+withdraw);	
	}

	@Override
	public void deposite(float accBal)
	{
		System.out.println("Account balance is: "+getAccBal()+" Rs"+"\n"+"Limited credit is: "
				+getCreditlimited()+" Rs");
		
	}

	@Override
	public String toString() 
	{
		return "CurrentAcc [getCreditLimited()=" + getCreditlimited() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
    

}

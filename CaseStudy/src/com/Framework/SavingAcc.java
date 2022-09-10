package com.Framework;

public abstract class SavingAcc extends BankAcc{
	private boolean isSalaried = true;
	private static final float MINBAL = 500.00f;
	
	
	//constructor
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
		
	}


	public boolean isSalaried() 
	{
		return isSalaried;
	}


	public void setSalaried(boolean isSalaried)
	{
		this.isSalaried = isSalaried;
	}


	public static float getMinbal()
	{
		return MINBAL;
	}

//methods
	@Override
	public void withdraw(float withdraw)
	{
		System.out.println("Account No: "+ getAccNo()+"\n"+"Account Name: "+ getAccNm()+"\n"
				+"isSavingAccount: "+isSalaried()+"\n"+"Amount of money withdraw: "+withdraw);
		
	}


	@Override
	public void deposite(float accBal) 
	{
		System.out.println("Account balance is: "+getAccBal()+" Rs"+"\n"+"Mininum account balance is: "
				+getMinbal()+" Rs");
	
	}


	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getMINBAL()=" + getMinbal() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package com.Application;

import com.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	//constructor
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}
	public float getAccBal() {
		return accBal;
		
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
		return "MMSavingAcc [getAccBal()=" + getAccBal() + ", isSalaried()=" + isSalaried() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
		
	
	
	
	
}

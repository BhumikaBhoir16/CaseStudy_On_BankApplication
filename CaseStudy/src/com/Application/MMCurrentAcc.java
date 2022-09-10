package com.Application;

import com.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	//constructor
	public  MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimited) {
	super(accNo, accNm, accBal, creditLimited);
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
		return "MMCurrentAcc [getCreditlimited()=" + getCreditlimited() + ",toString()=" + super.toString() + ", getAccBal()=" + getAccBal() + "]";
	}
	
	
	
	
	
	
	
}

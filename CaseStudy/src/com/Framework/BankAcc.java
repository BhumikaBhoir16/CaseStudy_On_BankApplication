package com.Framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	protected float accBal;
	
	
	
	public int getAccNo()
	{
		return accNo;
	}
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}
	public String getAccNm()
	{
		return accNm;
	}
	public void setAccNm(String accNm) 
	{
		this.accNm = accNm;
	}
	public float getAccBal() 
	{
		return accBal;
	}
	public void setAccBal(float accBal) 
	{
		this.accBal = accBal;
	}
	
//constructor	
	public BankAcc(int accNo, String accNm, float accBal)
	{
		this.accNo=accNo;
		this.accNm=accNm;
		this.accBal=accBal;
	}
		
	//methods
	public abstract void withdraw(float withdraw);
	public abstract void deposite(float accBal);
	@Override
	public String toString() {
		return "BankAcc [accBal=" + accBal + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}

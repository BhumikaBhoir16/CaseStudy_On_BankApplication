package com.Application;

import com.Framework.BankFactory;
import com.Framework.CurrentAcc;
import com.Framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc MMSaving = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return MMSaving;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimited) {
		MMCurrentAcc MMCurrent = new MMCurrentAcc(accNo, accNm, accBal, creditLimited);
		return MMCurrent;
	}
	
	

}

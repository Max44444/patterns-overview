package com.company.facade;

public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountNumberChecker;
    SecurityCodeCheck securityCodeChecker;
    FundsCheck fundsChecker;
    WelcomeToBank bankWelcome;

    public BankAccountFacade(int newAcctNum, int newSecCode) {
        accountNumber = newAcctNum;
        securityCode = newSecCode;

        bankWelcome = new WelcomeToBank();
        accountNumberChecker = new AccountNumberCheck();
        securityCodeChecker = new SecurityCodeCheck();
        fundsChecker = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if (accountNumberChecker.accountActive(getAccountNumber()) &&
            securityCodeChecker.isCodeCorrect(getSecurityCode()) &&
            fundsChecker.haveEnoughMoney(cashToGet)) {

            System.out.println("Transaction complete");
        } else {
            System.out.println("Transaction Failed");
        }
    }

    public void depositCash(double cashToDeposit) {
        if (accountNumberChecker.accountActive(getAccountNumber()) &&
            securityCodeChecker.isCodeCorrect(getSecurityCode())) {
            fundsChecker.makeDeposit(cashToDeposit);

            System.out.println("Transaction complete");
        } else {
            System.out.println("Transaction Failed");
        }
    }

}

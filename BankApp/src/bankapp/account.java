/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author KINGSLEY
 */
public class account {
    
    String firstName;
    
    String lastName;
    
    double acctBalance;
    
    double mobileBalance;
    
    String mobileNumber;
    
    int usrNumber;
    
    int pin;

    public account(String firstName, String lastName, double acctBalance, double mobileBalance, String mobileNumber, int usrNumber, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acctBalance = acctBalance;
        this.mobileBalance = mobileBalance;
        this.mobileNumber = mobileNumber;
        this.usrNumber = usrNumber;
        this.pin = pin;
    }
    
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAcctBalance() {
        return acctBalance;
    }

    public void setAcctBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }

    public double getMobileBalance() {
        return mobileBalance;
    }

    public void setMobileBalance(double mobileBalance) {
        this.mobileBalance = mobileBalance;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getUsrNumber() {
        return usrNumber;
    }

    public void setUsrNumber(int usrNumber) {
        this.usrNumber = usrNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    
    
    
    
}

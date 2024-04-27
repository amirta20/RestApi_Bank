package com.example.cc1bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {
    @Id
    int accountNumber;
    String firstName,lastName,emailId,gender;
    int mobileNo;
    String city,branchName,district,state,country,tyepOfAccount;
    public Bank()
    {
        
    }
    public Bank(int accountNumber, String firstName, String lastName, String emailId, String gender, int mobileNo,
            String city, String branchName, String district, String state, String country, String tyepOfAccount) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.gender = gender;
        this.mobileNo = mobileNo;
        this.city = city;
        this.branchName = branchName;
        this.district = district;
        this.state = state;
        this.country = country;
        this.tyepOfAccount = tyepOfAccount;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
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
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getTyepOfAccount() {
        return tyepOfAccount;
    }
    public void setTyepOfAccount(String tyepOfAccount) {
        this.tyepOfAccount = tyepOfAccount;
    }
    
    
}

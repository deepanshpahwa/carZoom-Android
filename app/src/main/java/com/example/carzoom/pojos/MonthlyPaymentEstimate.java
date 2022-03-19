
package com.example.carzoom.pojos;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class MonthlyPaymentEstimate implements Serializable
{

    @SerializedName("downPaymentAmount")
    @Expose
    private double downPaymentAmount;
    @SerializedName("downPaymentPercent")
    @Expose
    private int downPaymentPercent;
    @SerializedName("interestRate")
    @Expose
    private int interestRate;
    @SerializedName("loanAmount")
    @Expose
    private double loanAmount;
    @SerializedName("monthlyPayment")
    @Expose
    private double monthlyPayment;
    @SerializedName("price")
    @Expose
    private int price;
    @SerializedName("termInMonths")
    @Expose
    private int termInMonths;
    private final static long serialVersionUID = 5264655138131656021L;

    public double getDownPaymentAmount() {
        return downPaymentAmount;
    }

    public void setDownPaymentAmount(double downPaymentAmount) {
        this.downPaymentAmount = downPaymentAmount;
    }

    public int getDownPaymentPercent() {
        return downPaymentPercent;
    }

    public void setDownPaymentPercent(int downPaymentPercent) {
        this.downPaymentPercent = downPaymentPercent;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(int termInMonths) {
        this.termInMonths = termInMonths;
    }

}

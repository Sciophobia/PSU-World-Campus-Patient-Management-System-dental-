package com.mycompany.team6;

import java.time.LocalDate;

/**
 *
 * @author timothy gallagher
 */
public class PatientInvoice {
    public void PatientInvoice(LocalDate billdate, double amountBilled){
        this.billdate = billdate;
        this.amountBilled = amountBilled;
    }
    private LocalDate billdate;
    private double dueBalance;
    private double copay;
    private double insuranceAmountCovered;
    private double amountBilled;
    
   public LocalDate getBillDate(){
       return this.billdate;
   }
   
   public double getBalance(){
       return this.dueBalance;
   }
   
   public double getCopay(){
           return this.copay;
   }

public double getInsuranceAmountCovered(){
    return insuranceAmountCovered;

}   
    
public double getAmountBilled(){
    return amountBilled;
}
    
   public void setBillDate(LocalDate billdate){
       this.billdate = billdate;
   }
   
   public void setBalance(double balanceowed){
       this.dueBalance = balanceowed;
   }
   
   public void setCopay(double pCopay ){
           this.copay = pCopay;
   }

public void setInsuranceAmountCovered(double coverage){
    this.insuranceAmountCovered = coverage;

}   
    
public void setAmountBilled(double billedAmount){
     this.amountBilled = billedAmount;
}
}

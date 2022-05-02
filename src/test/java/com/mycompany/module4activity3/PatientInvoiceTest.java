/*
 * @author timothy gallagher
 */
package com.mycompany.module4activity3;

import com.mycompany.team6.PatientInvoice;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author timot
 */
public class PatientInvoiceTest {

    public PatientInvoiceTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of PatientInvoice method, of class PatientInvoice.
     */
    @org.junit.jupiter.api.Test
    public void testPatientInvoice() {
        System.out.println("PatientInvoice");
        LocalDate billdate = null;
        double amountBilled = 0.0;
        PatientInvoice instance = new PatientInvoice();
        instance.PatientInvoice(billdate, amountBilled);

    }

    /**
     * Test of getBillDate method, of class PatientInvoice.
     */
    @org.junit.jupiter.api.Test
    public void testGetBillDate() {
        System.out.println("getBillDate");
        PatientInvoice instance = new PatientInvoice();
        LocalDate expResult = null;
        LocalDate result = instance.getBillDate();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBalance method, of class PatientInvoice.
     */
    @org.junit.jupiter.api.Test
    public void testGetBalance() {
        System.out.println("getBalance");
        PatientInvoice instance = new PatientInvoice();
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getCopay method, of class PatientInvoice.
     */
    @org.junit.jupiter.api.Test
    public void testGetCopay() {
        System.out.println("getCopay");
        PatientInvoice instance = new PatientInvoice();
        double expResult = 0.0;
        double result = instance.getCopay();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getInsuranceAmountCovered method, of class PatientInvoice.
     */
    @org.junit.jupiter.api.Test
    public void testGetInsuranceAmountCovered() {
        System.out.println("getInsuranceAmountCovered");
        PatientInvoice instance = new PatientInvoice();
        double expResult = 0.0;
        double result = instance.getInsuranceAmountCovered();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getAmountBilled method, of class PatientInvoice.
     */
    @org.junit.jupiter.api.Test
    public void testGetAmountBilled() {
        System.out.println("getAmountBilled");
        PatientInvoice instance = new PatientInvoice();
        double expResult = 0.0;
        double result = instance.getAmountBilled();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of setBillDate method, of class PatientInvoice.
     */
    @org.junit.jupiter.api.Test
    public void testSetBillDate() {
        System.out.println("setBillDate");
        LocalDate billdate = null;
        PatientInvoice instance = new PatientInvoice();
        instance.setBillDate(billdate);

    }

    /**
     * Test of setBalance method, of class PatientInvoice.
     */
    @org.junit.jupiter.api.Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double balanceowed = 0.0;
        PatientInvoice instance = new PatientInvoice();
        instance.setBalance(balanceowed);

    }

    /**
     * Test of setCopay method, of class PatientInvoice.
     */
    @org.junit.jupiter.api.Test
    public void testSetCopay() {
        System.out.println("setCopay");
        double pCopay = 0.0;
        PatientInvoice instance = new PatientInvoice();
        instance.setCopay(pCopay);

    }

    /**
     * Test of setInsuranceAmountCovered method, of class PatientInvoice.
     */
    @org.junit.jupiter.api.Test
    public void testSetInsuranceAmountCovered() {
        System.out.println("setInsuranceAmountCovered");
        double coverage = 0.0;
        PatientInvoice instance = new PatientInvoice();

    }

    /**
     * Test of setAmountBilled method, of class PatientInvoice.
     */
    @org.junit.jupiter.api.Test
    public void testSetAmountBilled() {
        System.out.println("setAmountBilled");
        double billedAmount = 0.0;
        PatientInvoice instance = new PatientInvoice();
        instance.setAmountBilled(billedAmount);

    }

}

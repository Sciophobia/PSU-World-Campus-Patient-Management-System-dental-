/*
 * @author timothy gallagher
 */
package com.mycompany.module4activity3;

import com.mycompany.team6.Dentist;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author timot
 */
public class DentistTest {

    public DentistTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of PatientInvoice method, of class Dentist.
     */
    @Test
    public void testPatientInvoice() {
        System.out.println("PatientInvoice");
        String firstName = "";
        String lastName = "";
        Dentist instance = new Dentist();
        //instance.PatientInvoice(firstName, lastName);

    }

    /**
     * Test of getFirstName method, of class Dentist.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Dentist instance = new Dentist();
        instance.setFirstName("test");
        String expResult = "test";
        String result = instance.getFirstName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getLastName method, of class Dentist.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Dentist instance = new Dentist();
        instance.setLastName("test");
        String expResult = "test";
        String result = instance.getLastName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getUsername method, of class Dentist.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Dentist instance = new Dentist();
        instance.setUserName("testUser");
        String expResult = "testUser";
        String result = instance.getUsername();
        assertEquals(expResult, result);

    }

    /**
     * Test of setFirstName method, of class Dentist.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Dentist instance = new Dentist();
        instance.setFirstName(firstName);

    }

    /**
     * Test of setLastName method, of class Dentist.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Dentist instance = new Dentist();
        instance.setLastName(lastName);

    }

    /**
     * Test of setUserName method, of class Dentist.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String username = "";
        Dentist instance = new Dentist();
        instance.setUserName(username);

    }

}

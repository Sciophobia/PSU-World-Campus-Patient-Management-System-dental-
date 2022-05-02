
package com.mycompany.team6;

/**
 *
 * @author timot
 */
public class Person {

    private String firstName;
    private String lastName;

    public void Person(String firstN, String lastN) {
        this.firstName = firstN;
        this.lastName = lastN;
        
    }
    public void Person() {

        
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

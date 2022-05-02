package com.mycompany.team6;

/**
 *
 * @author timothy gallagher
 */
public class Dentist {
        private String firstName;
        private String lastName;
        private String username;
        

        public String getFirstName(){
            return this.firstName;
        }
        public String getLastName(){
            return this.lastName;
        }
        public String getUsername(){
            return this.username;
        }
        
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }
        public void setUserName(String username){
            this.username = username;
        }
}

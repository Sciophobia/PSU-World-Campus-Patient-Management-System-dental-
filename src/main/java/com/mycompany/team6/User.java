
package com.mycompany.team6;

public class User {
    private String username;
    private String password;
     public void User(String userName, String password) {
        this.username = userName;
        this.password = password;
        
    }   
   
     public String getUser(){
         return this.username;
     }
     
     public String getPass(){
         return this.password;
     }
     
     public void setUser(String s){
         username= s;
     }
     
     public void setPass(String p){
         password = p;
     }
}

package com.company.class23.Task4;

public class Registration {

/*Create Registration Class in which you would have variables
as email, userName and password that have an access scope only within its own class.
After creating an object of the class user should be able to call methods and in each method separately
pass values to set users email, username and password.
Requirements:
Valid email consider to be only yahoo
Valid userName and password cannot be empty and should be of length larger than 6 characters.
Also valid password cannot contain userName.
 */

    String email;
    String userName;
    String password;

    public String getEmail() {
    return email;
    }

    public void setEmail(String email){
        this.email=email;
   if(email.contains("yahoo)")){
       System.out.println("Valid email");
   }else{
       System.out.println("Invalid email");
   }
    }

    public String getUserName() {
        return userName;
    }

public void setUserName(String userName){
        this.userName=userName;
        if(userName.length()>6){
            System.out.println("Valid user name");
        }else{
            System.out.println("Invalid use name");
        }
}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    if(password.contains(userName) && password.isEmpty()){
        System.out.println("password is Invalid");
    }else{
        System.out.println("password is valid");
    }

    }

        public static void main(String[] args) {

        Registration registration=new Registration();

        registration.setEmail("email@yahoo.com");
       registration.setUserName("UserName");
       registration.setPassword("password");

            System.out.println(registration.getEmail());
            System.out.println(registration.getUserName());
            System.out.println(registration.getPassword());
        }

    }




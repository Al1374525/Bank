package main.java.banking;
import java.util.Scanner;

public class Login {

//we are setting up the instance field for the actual password and account number for an example individual.
//this format is just a beta format. Will change the functionality later on.
    int realAccountNumber = 19652001;
    int realPassWord = 200107;
//This will serve as the input field for the account number and password
    int accountNum;
    int password;
    //created function to accept the input from the user
    public void acceptInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Account Number:");
        accountNum = scanner.nextInt();

        System.out.println("Enter your password");
        password = scanner.nextInt();
    }

    public void verify() throws invalidTransaction{
        if(accountNum == realAccountNumber && password == realPassWord){
            System.out.println("Login was successful");
            Banking banking = new Banking();
            System.out.println("  ");
            System.out.println("Your balance is " + banking.getBalance());
            System.out.println(" ");
            Menu menu = new Menu();
            menu.showMenu();
            //we are going to initiate menu.showMenu to get the user back to the  menu
        }
        else{
            System.out.println("Login failed: "); 
            invalidTransaction loginFailed = new invalidTransaction("Incorrect login credentials");
             System.out.println(loginFailed.getMessage());
             throw loginFailed;
        }
    }
    
}

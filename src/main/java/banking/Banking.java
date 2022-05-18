package main.java.banking;
import java.util.Scanner;

public class Banking {
    //instance field
    int amount;

    public void initiate(){ // will be used to login by calling the login class 
        Login login = new Login();
        try{
            login.acceptInput();
            login.verify();
        } catch(Exception a){

            try{
                login.acceptInput();
                login.verify();
            } catch(Exception b){

            }
        }
    }
    public int getBalance(){ // will return the available balance acts as a kind of 'constructor'

        return amount;
        
    }
    public void add(int depot) { //adding amount to be deposited to the balance
        amount = amount + depot;
        System.out.println("Amount deposited succesfully");
        System.out.println(" ");

    
    }

    public void withdraw(int depot){
        System.out.println(" ");

        if(amount < depot){ //if the amount in the account is less than what is deposited 
            invalidTransaction invalidwithdraw = new invalidTransaction("Invalid withdraw amount");
        

        } else{
            amount = amount - depot;
            System.out.println("Please Collect your " + depot + "Dollars/Euros");
            System.out.println(" ");
            System.out.println("Total Balance: " + amount);
            System.out.println(" ");
            System.out.println("Thank you for Banking with CityBank!");
        }

    }
}

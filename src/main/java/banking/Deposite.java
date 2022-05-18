package main.java.banking;
import java.util.Scanner;

public class Deposite {
    //we are creating an instance of a class of an initial amount of zero
    int amount = 0;
    public int userInput(){
        try (// creating a scanner object from the scanner class 
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the amount to be deposited:");
            amount = scanner.nextInt();
        }
        if(amount <=0){
           //this is checkinh for an invalid transaction. this will alert the user if there is an invalid deposit amount
            invalidTransaction depositeError = new invalidTransaction("Invalid Deposite Amount");
            System.out.println(depositeError.getMessage());
        }
        else{
            return amount;
        }
        return amount;


    }
}

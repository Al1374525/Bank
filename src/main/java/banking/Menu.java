package main.java.banking;
import java.util.Scanner;

public class Menu {
    //this instance variable will represent the selected option of a menu 
    int selectOption; 
    Banking banking = new Banking(); //creating a new banking object

    public void showMenu(){
        System.out.println("Please select option below");
        System.out.println("Press 1 to initiate a withdraw");
        System.out.println("Press 2 to initiate a deposite");
        System.out.println("Press 3 to view balance ");
        System.out.println("Press any key to exit");

        //create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        //prompt user to press any key
        System.out.println("Press any key:");

        //selected option will allow us to take a numerical input from the user to exit the program
        selectOption = scanner.nextInt();

        //we will use a switch case to utilize the different functions within the menu function of the bank.

        switch(selectOption){
            case 1:
           //create a new deposite object of the deposite class
            Deposite d = new Deposite();
           //creating the int variable to store the value of the deposite object "d", in which acesses the data present in the userInput function

            int depot = d.userInput();
            banking.add(depot);
            showMenu();

            break;

            case 2:
            System.out.println("Enter the amount to withdraw");
            int withdrawAmount = scanner.nextInt();
            //we are going to change withdraw with the correct object to be used  
            banking.withdraw(withdrawAmount);
            showMenu();
            break;



            case 3: // we want to be able to depict the account balance in the banking account
            System.out.println("Your account balance is " + banking);
            System.out.println(" ");
            showMenu();
            break;




            default: // we want to be able to illustrate to the user that the transaction has ended 
            System.out.println("Transaction ended");
            //System.exit terminates the current Java Virtual Machine 
            System.exit(0);
            break;
             // don't forget to add the 'break' command after the System.exit
            
            
        



        }




    }
}

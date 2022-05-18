package main.java.banking;
import java.util.Scanner;
public class invalidTransaction extends Exception {
    String errorMessage;

    public invalidTransaction(String message){
        errorMessage = message;
    }
    
    public String getMessage(){
        
        return errorMessage;

    }

  
    
}

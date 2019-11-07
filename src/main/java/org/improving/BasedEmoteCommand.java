package org.improving;

import java.util.ArrayList;
import java.util.List;

public abstract class BasedEmoteCommand {
    private String userInput;
    private String outputString;

    public BasedEmoteCommand(String userInput, String outputString){
    this.userInput = userInput;
    this.outputString = outputString;
}

    public boolean isValid(String input){
        return input.equalsIgnoreCase(userInput);
    }

    public void execute(){
        System.out.println(outputString);
    }

//    public boolean invalidInput(String input){
//
////    "Please try again.You can "+ commands
//        return invalidInput(incorrect);
//    }

}

package org.improving.Commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DanceCommandTest {

    @Test
    public void Command_should_execute_with_caps(){
        //Arrange
        var danceCommand = new DanceCommand();

        //Act
         var result = danceCommand.isValid("daNce");
        //Assert
        assertTrue(result);
    }


    @Test
    public void isValid_should_return_false_when_spaces(){
        //Arrange
        var greetCommand = new GreetCommand();
        //Act
        var result = greetCommand.isValid(" dance");
        //Assert
        assertFalse(result);
    }

}
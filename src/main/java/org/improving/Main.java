package org.improving;

import org.improving.Commands.DanceCommand;
import org.improving.Commands.GreetCommand;
import org.improving.Commands.KickCommand;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<BasedEmoteCommand> commands = new HashSet<>(Arrays.asList(new DanceCommand(), new KickCommand(), new GreetCommand()));

        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while (true) {
            System.out.print(">");
            var input = scanner.nextLine();

            for (BasedEmoteCommand command : commands) {
                if (command.isValid(input)) {
                    command.execute();
                } else {
                    loop = false;
                }

            }
        }
    }
}

package com.itstep.academy.demo2.command;

import java.util.Map;

public class CommandContainer {

    private final static Map<String, Command> commands = Map.of(
        "GetUserCommand", new GetUserCommand(),
        "AddUserCommand", new AddUserCommand(),
        "GetUserListCommand", new GetUserListCommand()
    );

    public static Command getCommand(String commandName) {
        return commands.get(commandName);
    }
}

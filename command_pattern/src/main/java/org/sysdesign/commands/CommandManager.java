package org.sysdesign.commands;

import java.util.Stack;

public class CommandManager {

    private Stack<Command> history = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
        redoStack.clear();
    }

    public void undo() {
        // We need to execute an command from the history
        if(history.empty()) {
            return;
        }

        Command prevCommand = history.pop();
        prevCommand.undo();
        redoStack.push(prevCommand);
    }

    public void redo() {

        if(redoStack.empty()) {
            return;
        }

        Command redoCommand = redoStack.pop();
        redoCommand.execute();
        history.push(redoCommand);
    }

}

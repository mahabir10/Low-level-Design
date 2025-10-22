package org.sysdesign;

import org.sysdesign.commands.CommandManager;
import org.sysdesign.commands.InsertTextCommand;
import org.sysdesign.editor.Editor;

public class Main {
    public static void main(String[] args) {


        Editor editor = new Editor();
        CommandManager commandManager = new CommandManager();

        commandManager.executeCommand(new InsertTextCommand(editor, "Hello "));
        commandManager.executeCommand(new InsertTextCommand(editor, "World"));

        System.out.println(("Text: " + editor.getText()));

        commandManager.executeCommand(new InsertTextCommand(editor, "!")); // This is a mistake
        System.out.println("Text: " + editor.getText());
        commandManager.undo(); // Here we undo our mistake
        System.out.println("Text: " + editor.getText());
        commandManager.redo(); // We realize that, it was not a mistake, but correct. So we redo what we did undo.
        System.out.println("Text: " + editor.getText());

    }
}
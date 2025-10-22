package org.sysdesign.commands;

import org.sysdesign.editor.Editor;

public class InsertTextCommand implements Command{

    private final Editor editor;
    private final String stringToInsert;

    public InsertTextCommand(Editor editor, String text) {
        this.editor = editor;
        this.stringToInsert = text;
    }

    @Override
    public void execute() {
        this.editor.insert(stringToInsert);
    }

    @Override
    public void undo() {
        this.editor.deleteLast(this.stringToInsert.length());
    }
}

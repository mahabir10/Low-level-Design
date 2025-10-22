package org.sysdesign.commands;

public interface Command {
    void execute();
    void undo();
}

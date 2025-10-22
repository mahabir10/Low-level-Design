package org.sysdesign.editor;

public class Editor {

    private StringBuilder text = new StringBuilder();

    public void insert(String newText) {
        text.append(newText);
    }

    public void deleteLast(int length) {
        int start = text.length() - length;
        if (start >= 0) {
            text.delete(start, text.length());
        }
    }

    public String getText() {
        return text.toString();
    }
}

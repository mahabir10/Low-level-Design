package org.sysdesign.decorators;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStream extends FilterInputStream {

    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    public UpperCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();

        if(c >= 97 && c<=122){
            c-=32;
        }
        return c;
    }
}

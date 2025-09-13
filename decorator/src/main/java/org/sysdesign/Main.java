package org.sysdesign;

import org.sysdesign.decorators.LowerCaseInputStream;
import org.sysdesign.decorators.UpperCaseInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        String filePath = "/example.txt";

        try(InputStream in = Main.class.getResourceAsStream(filePath)){
            InputStream ls = new LowerCaseInputStream(in);
            ls = new UpperCaseInputStream(ls);


            int b;
            while((b = ls.read()) != -1){
                System.out.print((char)b);
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
package com.MyTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilleReader {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("c.txt");
        int len;
        char[] cbuf = new char[2];
        while ((len = fr.read())!= -1){
            System.out.println((char)len);
        }
        fr.close();
    }
    
    
}

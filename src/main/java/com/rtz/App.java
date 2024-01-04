package com.rtz;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
    	PrintWriter output = new PrintWriter("log.txt");
        output.println( "Hello World!" );
        output.close();
    }
}

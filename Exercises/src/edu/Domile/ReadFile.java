package edu.Domile;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {
    List<String> myList;

    public ReadFile() {
        this.myList = new ArrayList<>();
    }

    public ArrayList<String> read() {
        byte[] array = new byte[100];

        try {
            InputStream input = new FileInputStream("C:\\Users\\PC\\Pictures\\randomfile.txt");

            System.out.println("Available bytes in the file: " + input.available());

            // Read byte from the input stream
            input.read(array);
            System.out.println("Data read from the file: ");

            // Convert byte array into string
            String data = new String(array);
            System.out.println(data);
            // Close the input stream
            input.close();

            myList = new ArrayList<String>(Arrays.asList(data.split(" ")));

        } catch (Exception e) {
            e.getStackTrace();
        }
        return (ArrayList) myList;
    }
}


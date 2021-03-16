package edu.Domile;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

public class WriteFile {
    List<String> myList;

    public WriteFile(List<String> myList) {
        this.myList = myList;
    }

    public void write() {
        String data = myList.toString();
        try {
            OutputStream out = new FileOutputStream("C:\\Users\\PC\\Pictures\\randomNewfile.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

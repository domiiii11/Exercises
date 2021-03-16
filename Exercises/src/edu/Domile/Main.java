package edu.Domile;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ReadFile().read();
        Collections.reverse(list);
        WriteFile writeFile = new WriteFile(list);
        writeFile.write();
    }

}

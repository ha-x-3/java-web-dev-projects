package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        //Divide(4 , 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.ai");

        // Test out your CheckFileExtension() function!

        for (Map.Entry<String, String> file : studentFiles.entrySet()) {
            String student = file.getKey();
            String submittedFile = file.getValue();
            System.out.println(student + ": " + CheckFileExtension(submittedFile));
        }
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        if (y == 0) {
            try {
                throw new ArithmeticException("You can't divide by zero silly!");
            } catch(ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(x / y);
        }


    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        int grade = 0;
        if (fileName.contains(".java")) {
            grade = 1;
        }  else if (fileName == null || fileName == "") {
            try {
                throw new CheckFileExtensionException("A file submitted was empty or unnamed. Grade = -1.");
            } catch (CheckFileExtensionException e) {
                e.printStackTrace();
            }
            grade = -1;
        }  else if (!fileName.contains(".java")) {
            grade = 0;
        }
        return grade;
    }
}
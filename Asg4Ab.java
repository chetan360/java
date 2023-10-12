/*
 b) Write a program to read a text file sample.txt and display the contents of a file in
reverse order and also original contents change the case (display in upper case).
 */


import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Asg4Ab {
    public static void main(String[] args) throws IOException {
        StringBuilder content = new StringBuilder();

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        
        String str;
        while((str = br.readLine()) != null) {
            content.append(str).append("\n");
        }
        br.close();

        String finalStr = content.reverse().toString().toUpperCase();
        System.out.println(finalStr);
    }
}

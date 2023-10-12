/*
 c) Accept the names of two files and copy the contents of the first to the second.
First file having Book name and Author name in file. Second file having the contents
of First file and also add the comment ‘end of file’ at the end.
 */


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.util.Scanner;

public class Asg4Ac {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of original file :");
        String fpName1 = sc.nextLine();
        
        System.out.println("Enter the name of copy file :");
        String fpName2 = sc.nextLine();
        sc.close();

        BufferedReader br = new BufferedReader(new FileReader(fpName1));
        PrintWriter fp = new PrintWriter(new FileWriter(fpName2));

        String str;
        while((str = br.readLine()) != null) {
            fp.println(str);
        }
        fp.println("//end of file");

        System.out.println("Data copied successfully.");

        br.close();
        fp.close();
    }
}

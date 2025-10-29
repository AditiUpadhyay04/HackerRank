import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class EndOfFile{

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int lineNum = 1;

            while(sc.hasNext()){
                String line = sc.nextLine();

                System.out.println(lineNum + " " + line);
                lineNum++;
            }
            sc.close();

        }
    }



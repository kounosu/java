package class5;

import java.util.Scanner;

public class ClassSample03 {

    public static void main(String[] args) {
        System.out.print("Input Data:");
        Scanner scan = new Scanner(System.in);      //  文字列を入力
        int i = 1;
        while(scan.hasNext()){
        String str = scan.next();
            System.out.println(i + " : "+ str);
            i++;
        }
        scan.close();
    }

}
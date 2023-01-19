package class5;

import java.util.Scanner;

public class ClassSample02 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        String str1 = "one,two,three";
        String str2 = "apple orange pineapple";
        Scanner sc1 = new Scanner(str1);
        sc1.useDelimiter(",");                  //  「,」で区切る
        while(sc1.hasNext()){                   //ScannerクラスのhasNext()メソッド
                System.out.println(sc1.next());     //next()メソッドを使い文字を分割
        }
        System.out.println();
        Scanner sc2 = new Scanner(str2);            //文字列を引数にScannerを生成
        while(sc2.hasNext()){                   //ScannerクラスのhasNext()メソッド
                System.out.println(sc2.next());     //next()メソッドを使い文字を分割
        }
        sc1.close();
        sc2.close();
    }

}

package class5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ClassSample04 {

    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc = new Scanner(new BufferedReader(new FileReader("csvsample.csv")));
            sc.useDelimiter(",");                   //区切り文字設定
            while(sc.hasNext()){
	            System.out.print(sc.next() + " ");  //next()メソッドでトークンを取得
	        }
        }catch(FileNotFoundException e){
            System.out.println("ファイルが見つかりません。");
        }finally{
            if(sc != null){
                sc.close();
            }
        }

    }

}
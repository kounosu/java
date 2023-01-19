package class1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClassSample04 {

    public static void main(String[] args){
        FileReader fr = null;                   //finallyで使うのでここで宣言
        try{                                    //例外処理
            fr = new FileReader("c:\\test\\File1.txt");     //ストリームのオープン
            int c;                                          //char型なのでintに代入
            while((c = fr.read()) != -1){   //文字が無かったら-1が返る
                    System.out.print((char)c);      //int型をchar型に型変換
            }
        }catch(FileNotFoundException e1){
            System.out.println("ファイルが見つかりません。");
        }catch(IOException e2){
            System.out.println("ファイルエラーです。");
        }finally{
            try{                                //ここでも例外処理が必要
                if(fr != null) fr.close();      //nullでなければここでファイルクローズ
            }catch(IOException e){
                System.out.println("ファイルクローズい失敗しました。");
            }
        }
    }
}
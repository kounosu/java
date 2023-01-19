package class1;

import java.io.*;

public class ClassSample05 {
    public static void main(String[] args){
        FileWriter fw = null;
        FileReader fr = null;                   //finallyで使うのでここで宣言
        try{
            String fileName = "c:\\test\\File2.txt";
            fw = new FileWriter(fileName);  //ストリームのオープン
            fr = new FileReader(fileName);  //ストリームのオープン
            fw.write("あいうえお\r\n");          //文字の出力①
            fw.write("かきくけこ\r\n");          //文字の出力②
            fw.flush();                         //ここでフラッシュ
            fw.write("さしすせそ\r\n");          //文字の出力③
            int c;                              //char型なのでintに代入
            while((c = fr.read()) != -1){       //文字が無かったら-1が返る
                System.out.print((char)c);  //int型をchar型に型変換
            }
        }catch(FileNotFoundException e){
            System.out.println("ファイルが見つかりません。");
        }catch(IOException ee){
            System.out.println("ファイルエラーです。");
        }finally{
            try{
                if(fw != null){
                    fw.close();         // ファイルクローズ
                }
                if(fr != null){
                    fr.close();         // ファイルクローズ
                }
            }catch(IOException e){

            }               //例外処理
        }
    }

}
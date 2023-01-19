package class1;

import java.io.FileWriter;
import java.io.IOException;

public class ClassSample03 {
    public static void main(String[] args){
        try{                                            //例外処理
            FileWriter fw = new FileWriter("c:\\test\\File1.txt");  //ファイルのオープン
            for(int i = 1; i <= 5; i++){
                fw.write(i + "行目\r\n");
            }
            fw.close();                                     //ファイルのクローズ
        }catch(IOException e){
            System.out.println("書き込みに失敗しました。");
        }
    }

}
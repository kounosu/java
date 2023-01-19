package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassSample01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        BufferedWriter bw = null;
        BufferedReader br = null;
        String FileName = "filesample2.txt";
        try{
            bw = new BufferedWriter(new FileWriter(FileName));
            bw.write("もも\r\n");
            bw.write("うめ\r\n");
            bw.write("さくら\r\n");
            bw.flush();                         //ここでフラッシュ
            br = new BufferedReader(new FileReader(FileName));
            String s;                           //文字列型に代入できる
            while((s = br.readLine()) != null){         //何も無かったらnullが返る
                    System.out.println(s);
            }
        }catch(FileNotFoundException e1){
            System.out.println("ファイルエラーです。");
        }catch(IOException e2){
            System.out.println("IOエラーです。");
        }finally{
            try{        //close()もIOExceptionをスローする
                if(bw != null) bw.close();
                if(br != null) br.close();
            }catch(IOException e){
                System.out.println("クローズ失敗");
            }
        }
    }

}
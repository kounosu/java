package class3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassSample02 {

    public static void main(String[] args) {
        PrintWriter pw = null;
        //FileWriterオブジェクトを生成する際にIOExceptionがスローされる可能性がある
        try {
            //PrintWriterクラスでラップしてファイルを指定
            pw = new PrintWriter(new BufferedWriter(new FileWriter("test2.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.println("Line1");
        pw.println("Line2");
        pw.flush();             //  フラッシュ処理
        System.out.println("Data Writing Finished.");
        //pw.close();
    }

}
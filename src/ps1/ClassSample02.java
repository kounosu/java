package class1;

import java.io.File;

public class ClassSample02 {
    public static void main(String[] args){
        File fi = new File("c:\\test");
        File[] fiList = fi.listFiles();
        System.out.println("指定したディレクトリは、" + fi.getAbsolutePath() + "です。");
        for(int i = 0; i < fiList.length; i++){
            if(fiList[i].isFile() == true){
                System.out.println("ファイル名は、" + fiList[i].getName() + "です。");
            }else if(fiList[i].isDirectory() == true){
                System.out.println("ディレクトリ名は、" + fiList[i].getName() + "です。");
            }
        }

    }

}
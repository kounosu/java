package day3;
 
public class Sample305 {
 
    public static void main(String[] args) {
        //標準出力
        int num = 1;                        //  整数値（いろいろ変えてみましょう）
        switch(num){
        case 1:
            System.out.println("one");    //  numが1だった場合の処理
            break;
        case 2:
            System.out.println("two");    //  numが2だった場合の処理
            break;
        case 3:
            System.out.println("three");  //  numが3だった場合の処理
            break;
        default:
            System.out.println("不適切な値です。"); //  それ以外の値が入力された場合の処理
        }
        /* 新しいswitch文
         * switch (num){     
		    （1）基本的な記述
		    case 1 -> System.out.println("one");
		    case 2 -> System.out.println("two");
		    （2） 複数のケースにも対応
		    case 3 ,4 -> System.out.println("three or four");
		     （3） 複数行を記述する場合
		    default -> {
		        System.out.println("不適切な値です。");
		    }
		};*/
    }
}
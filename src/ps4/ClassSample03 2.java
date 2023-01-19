package class4;

public class ClassSample03 {

    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "orange";

        System.out.println(str1.compareTo(str2));   //負の数が返る
        System.out.println(str1.compareTo(str1));   //0が返ります
        System.out.println(str2.compareTo(str1));   //正の数が返る
    }
}

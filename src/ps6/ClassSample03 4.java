package class6;

public class ClassSample03 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Apple Pineapple ");         //オブジェクトを生成
        sb.append("Banana");
        System.out.println(sb);     //  内容を表示(削除前）
        sb.delete(6, 16);
        System.out.println(sb);     //  内容を表示(削除後）
    }

}

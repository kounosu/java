package class7;

import java.text.NumberFormat;
import java.util.Locale;

public class ClassSample02 {

    public static void main(String[] args) {
        int number =12300;

        //ロケールを取得
        Locale jp = new Locale("ja","JP");      //日本
        Locale us = new Locale("en","US");      //アメリカ
        Locale de = new Locale("de","DE");      //ドイツ
        //ロケールに対応したオブジェクトを生成
        NumberFormat nfJapan1 =NumberFormat.getInstance(jp);            //数値
        NumberFormat nfJapan2 =NumberFormat.getCurrencyInstance(jp);    //通貨
        NumberFormat nfUsa1 =NumberFormat.getInstance(us);
        NumberFormat nfUsa2 =NumberFormat.getCurrencyInstance(us);
        NumberFormat nfFrance1 =NumberFormat.getInstance(de);
        NumberFormat nfFrance2 =NumberFormat.getCurrencyInstance(de);

        //フォーマットしたものを出力
        System.out.println(jp.getDisplayCountry());
        System.out.println("数値 : " + nfJapan1.format(number));
        System.out.println("通貨 : " + nfJapan2.format(number));
        System.out.println();

        System.out.println(us.getDisplayCountry());
        System.out.println("数値 : " + nfUsa1.format(number));
        System.out.println("通貨 : " + nfUsa2.format(number));
        System.out.println();

        System.out.println(de.getDisplayCountry());
        System.out.println("数値 : " + nfFrance1.format(number));
        System.out.println("通貨 : " + nfFrance2.format(number));

    }

}
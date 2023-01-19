package class7;

import java.util.Locale;

public class ClassSample01 {

    public static void main(String[] args) {
        //各言語と国のロケールを取得
        Locale jp = new Locale("ja","JP");  //日本のロケールを生成
        Locale us = new Locale("en","US");      //アメリカのロケールを生成
        Locale ch = new Locale("zh","CN");  //中国のロケールを生成

        //各ロケールの言語と国名を出力
        System.out.println("日本のロケール 言語 : "
        + jp.getDisplayLanguage() + " 国名 : " + jp.getDisplayCountry());
        System.out.println("アメリカのロケール 言語 : "
        + us.getDisplayLanguage() + " 国名 :" + us.getDisplayCountry());
        System.out.println("中国のロケール 言語 : "
        + ch.getDisplayLanguage() + " 国名 : " + ch.getDisplayCountry() );
    }

}
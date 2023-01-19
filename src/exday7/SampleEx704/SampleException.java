package exday7;
 
//  簡単な例外クラスのサンプル
public class SampleException extends Exception{
    //  シリアルバージョン番号
    private static final long serialVersionUID = 1L;
 
    //  コンストラクタ
    public SampleException(String message) {
        super(message);
    }
}
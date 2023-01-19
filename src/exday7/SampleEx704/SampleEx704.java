package exday7;
 
public class SampleEx704 {
 
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        try{
            //  故意に例外を発生させる
            throw new SampleException("自作の例外のサンプル");
        }catch(SampleException e){
            e.printStackTrace();
        }
    }
 
}
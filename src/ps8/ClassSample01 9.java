package java8;

//	仮想のインターフェース
interface ITest{
	public int calc(int x,int y);

}

//	実際にラムダ式を用いる
public class ClassSample01 {

	public static void main(String[] args){
		//	ラムダ式でITestのcalcメソッドを実装
		ITest c1 = (int x,int y) -> { return x + y; };
		ITest c2 = (int x,int y) -> { return x - y; };
		System.out.println("1 + 2 = "+c1.calc(1,2));
		System.out.println("5 - 3 = "+c2.calc(5,3));
	}

}

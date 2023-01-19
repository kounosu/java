package java8;

import java.util.Optional;

class Hoge{
	void foo() {
		System.out.println("foo");
	}
}

public class ClassSample03 {

    public static void main(String[] args) {
    	//	Hogeのインスタンスが取得できる場合
    	Optional<Hoge> h1 = Optional.ofNullable(getHoge1());
    	h1.ifPresent(hoge -> hoge.foo());
    	//	Hogeのインスタンスが取得できない場合
    	Optional<Hoge> h2 = Optional.ofNullable(getHoge2());
    	h2.ifPresent(hoge -> hoge.foo());	//	実行できないのでエラーにならない
    }
    //	Hogeクラスのインスタンスを生成する
    public static Hoge getHoge1() {
    	return new Hoge();
    }
    //	nullを返す
    public static Hoge getHoge2() {
    	return null;
    }
}

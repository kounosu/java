package java8;

import java.util.Arrays;
import java.util.List;

public class ClassSample02 {

	public static void main(String args[]) {
        List<String> array = Arrays.asList("Orange", "Apple", "Pineapple", "Apple", "Banana");

        // filter(指定した要素を抽出)
        System.out.println("** filter **");
        array.stream()
            .filter(value -> value == "Apple")
            .forEach(value -> System.out.println(value));

        // limit(数の制限)
        System.out.println("** limit **");
        array.stream()
            .limit(3)
            .forEach(value -> System.out.println(value));

        // distinct（重複の解除）
        System.out.println("** distinct **");
        array.stream()
            .distinct()
            .forEach(value -> System.out.println(value));

        // sorted（並べ替え）
        System.out.println("** sorted **");
        array.stream()
            .sorted()
            .forEach(value -> System.out.println(value));

        // map（一通り処理する）
        System.out.println("** map **");
        array.stream()
            .map(s -> s.toLowerCase())
            .forEach(value -> System.out.println(value));

        // reduce（削除）
        System.out.println("** reduce **");
        String collectedStr = array.stream()
            .reduce((s, t) -> s + t)
            .get();
        System.out.println(collectedStr);
	}
}

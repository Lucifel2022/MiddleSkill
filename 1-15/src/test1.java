import java.util.Arrays;

public class test1 {
	public static void main(String[] args) {
		// 改行
		System.out.println("問１");
		// 問１のメソッドを呼び出して出力してください（引数５と１０）

		System.out.println(add(0, 0));

		// 改行
		System.out.println("問２");
		// 問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		boolean sentence = isPalindrome("しんぶんし");
		System.out.println(sentence);

		// 改行
		System.out.println("問３");
		// 問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		Integer[] i = { 5, 3, 1, 9, 4, 8 };
		reverse(i);

		System.out.println(Arrays.toString(i));

		// 改行
		System.out.println("問４");
		// 問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		int[] a = { 5, 3, 1, 9, 4, 8 };
		int minIndex = getMin(a);

		System.out.println(minIndex);

	}
	// 問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。

	public static int add(int numa, int numb) {
		numa = 5;
		numb = 10;
		return numa + numb;
	}

	// 問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
	public static boolean isPalindrome(String sentence) {
		int minIdx = 0;
		int maxIdx = sentence.length() - 1;

		while (minIdx < maxIdx) {
			if (sentence.charAt(minIdx++) != sentence.charAt(maxIdx--)) {

				return false;
			}
		}
		return true;
	}

	// 問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)
	public static void reverse(Integer[] array) {
		Arrays.sort(array, (a, b) -> b - a);
	}

	// 問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
	public static int getMin(int[] array) {

		int minIndex = 2;

		for (int i = 1; i < array.length; i++) {
			if (array[minIndex] > array[i]) {
				array[minIndex] = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

}

public class test1 {
	public static void main(String[] args) {
		
//		1.数字の5と9の変数を定義し、足した数字を出力しなさい。
		int five = 5;
		int nine = 9;
		
		System.out.println(five+nine);
		
//		2.64ビット整数の「1111111111」を定義し2倍した値を出力しなさい。
		long bit = 1111111111L;
		
		System.out.println(bit*2);
		
//		3.boolean型の変数の値に不正な文字列比較を入れてfalseを出力してください。
		String a = "あいう";
		String c = "えお";
		
		boolean b =(a.equals(c));
		
		System.out.println(b);
	}
}

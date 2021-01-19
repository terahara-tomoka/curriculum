package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator {

	private int a;
	private int b;
	private int c;

	/**
	 * タスクの実行
	 */
	public void doTask(int a, int b, int c) {

		// ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
		// 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("plusメソッド引数が一つの場合:" + (this.a));
		System.out.println("plusメソッド引数が二つの場合:" + (this.b));
		System.out.println("plusメソッド引数が三つの場合:" + (this.c));

	}
}
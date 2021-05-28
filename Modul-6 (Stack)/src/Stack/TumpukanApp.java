package Stack;

public class TumpukanApp {

	public static void main(String[] args) {
		Tumpukan tumpukan = new Tumpukan(10);
		System.out.println("Kode Program Stack (Tumpukan) : " + "\n");
		tumpukan.push(50);
		tumpukan.baca();
		tumpukan.space();
		tumpukan.push(100);
		tumpukan.baca();
		tumpukan.space();
		tumpukan.pop();
		tumpukan.baca();
		tumpukan.space();
		tumpukan.push(60);
		tumpukan.baca();
		tumpukan.space();
		tumpukan.push(80);
		tumpukan.baca();
		tumpukan.space();
		tumpukan.pop();
		tumpukan.baca();
		tumpukan.space();
		long nilai1 = tumpukan.peek();
		System.out.println("nilai top = " + nilai1 + "\n");
		tumpukan.address();
	}

}

import java.util.Scanner;

public class DordunveBesinKuvvetleri {

	public static void main(String[] args) {

		int n;

		Scanner inp = new Scanner(System.in);

		System.out.print("Sınır Sayısı Giriniz :");
		n = inp.nextInt();

		for (int i = 1; i < n; i *= 4)
			System.out.println("Dördün Kuvvetleri :" + i);

		for (int j = 1; j < n; j *= 5)
			System.out.println("Beşin Kuvvetleri :" + j);
	}

}

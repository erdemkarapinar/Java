import java.util.Scanner;
public class Sifre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a;
		String sifre = "12345";
		System.out.println("Þifrenizi giriniz:");
		a = input.next();
		if(a.equals(sifre)) {
			System.out.println("Giriþ baþarýlý :)");
		}
		else {
			System.out.println("Giriþ baþarýsýz :(");
		}
		
	}

}

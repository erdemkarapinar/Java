import java.util.Scanner;
public class Sifre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a;
		String sifre = "12345";
		System.out.println("�ifrenizi giriniz:");
		a = input.next();
		if(a.equals(sifre)) {
			System.out.println("Giri� ba�ar�l� :)");
		}
		else {
			System.out.println("Giri� ba�ar�s�z :(");
		}
		
	}

}

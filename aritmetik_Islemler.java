import java.util.Scanner;
public class aritmetik_Islemler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sayi;
		System.out.println("Toplama yapmak i�in 1 \n��karma yapmak i�in 2 \n�arpma yapmak i�in 3 \nB�lme yapmak i�in 4 � tu�lay�n�z.");
		System.out.println("�ste�iniz Say�y� Tu�lay�n�z:");
		sayi = input.next();
		String Toplam = "1";
		String C�kartma = "2";
		String Carpma = "3";
		String Bolme = "4";
		switch(sayi) {
		case "1":
			Scanner klavye = new Scanner(System.in);
			System.out.println("Toplamak istedi�iniz 1.say�y� giriniz:");
			int toplama = klavye.nextInt();
			Scanner giris = new Scanner(System.in);
			System.out.println("Toplamak istedi�iniz 2.say�y� giriniz:");
			int sayi2 = giris.nextInt();
			int sonuc = toplama+sayi2;
			System.out.println("Say�lar�n�z�n toplam�:" +sonuc);
		}
		switch(sayi) {
		case "2":
			Scanner klavye = new Scanner(System.in);
			System.out.println("��karmak istedi�iniz 1.say�y� giriniz:");
			int toplama = klavye.nextInt();
			Scanner giris = new Scanner(System.in);
			System.out.println("��karmak istedi�iniz 2.say�y� giriniz:");
			int sayi2 = giris.nextInt();
			int sonuc = toplama-sayi2;
			System.out.println("Say�lar�n�z�n fark�:" +sonuc);
		}
		switch(sayi) {
		case "3":
			Scanner klavye = new Scanner(System.in);
			System.out.println("�arpmak istedi�iniz 1.say�y� giriniz:");
			int toplama = klavye.nextInt();
			Scanner giris = new Scanner(System.in);
			System.out.println("�arpmak istedi�iniz 2.say�y� giriniz:");
			int sayi2 = giris.nextInt();
			int sonuc = toplama*sayi2;
			System.out.println("Say�lar�n�z�n toplam�:" +sonuc);
		}
		switch(sayi) {
		case "4":
			Scanner klavye = new Scanner(System.in);
			System.out.println("B�lmek istedi�iniz 1.say�y� giriniz:");
			int toplama = klavye.nextInt();
			Scanner giris = new Scanner(System.in);
			System.out.println("B�lmek istedi�iniz 2.say�y� giriniz:");
			int sayi2 = giris.nextInt();
			int sonuc = toplama/sayi2;
			System.out.println("Say�lar�n�z�n toplam�:" +sonuc);
		}
		
	}

}

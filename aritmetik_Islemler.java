import java.util.Scanner;
public class aritmetik_Islemler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sayi;
		System.out.println("Toplama yapmak için 1 \nÇýkarma yapmak için 2 \nÇarpma yapmak için 3 \nBölme yapmak için 4 ü tuþlayýnýz.");
		System.out.println("Ýsteðiniz Sayýyý Tuþlayýnýz:");
		sayi = input.next();
		String Toplam = "1";
		String Cýkartma = "2";
		String Carpma = "3";
		String Bolme = "4";
		switch(sayi) {
		case "1":
			Scanner klavye = new Scanner(System.in);
			System.out.println("Toplamak istediðiniz 1.sayýyý giriniz:");
			int toplama = klavye.nextInt();
			Scanner giris = new Scanner(System.in);
			System.out.println("Toplamak istediðiniz 2.sayýyý giriniz:");
			int sayi2 = giris.nextInt();
			int sonuc = toplama+sayi2;
			System.out.println("Sayýlarýnýzýn toplamý:" +sonuc);
		}
		switch(sayi) {
		case "2":
			Scanner klavye = new Scanner(System.in);
			System.out.println("Çýkarmak istediðiniz 1.sayýyý giriniz:");
			int toplama = klavye.nextInt();
			Scanner giris = new Scanner(System.in);
			System.out.println("Çýkarmak istediðiniz 2.sayýyý giriniz:");
			int sayi2 = giris.nextInt();
			int sonuc = toplama-sayi2;
			System.out.println("Sayýlarýnýzýn farký:" +sonuc);
		}
		switch(sayi) {
		case "3":
			Scanner klavye = new Scanner(System.in);
			System.out.println("Çarpmak istediðiniz 1.sayýyý giriniz:");
			int toplama = klavye.nextInt();
			Scanner giris = new Scanner(System.in);
			System.out.println("Çarpmak istediðiniz 2.sayýyý giriniz:");
			int sayi2 = giris.nextInt();
			int sonuc = toplama*sayi2;
			System.out.println("Sayýlarýnýzýn toplamý:" +sonuc);
		}
		switch(sayi) {
		case "4":
			Scanner klavye = new Scanner(System.in);
			System.out.println("Bölmek istediðiniz 1.sayýyý giriniz:");
			int toplama = klavye.nextInt();
			Scanner giris = new Scanner(System.in);
			System.out.println("Bölmek istediðiniz 2.sayýyý giriniz:");
			int sayi2 = giris.nextInt();
			int sonuc = toplama/sayi2;
			System.out.println("Sayýlarýnýzýn toplamý:" +sonuc);
		}
		
	}

}

package methods;

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacak) {
				mesajVer("Sayı Mevcut : " + aranacak);
				return;
			}
		}
		mesajVer("Sayı Mevcut Değil : " + aranacak);
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}

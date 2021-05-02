package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1=24;
		int sayi2=25;
		int sayi3 =2;
		int enBuyuk=sayi1;
		if(enBuyuk<sayi2)
		{
			enBuyuk=sayi2;
		}
		else if(enBuyuk<sayi3)
		{
			enBuyuk=sayi2;
		}
			System.out.println("En büyük = " +enBuyuk);

	}

}

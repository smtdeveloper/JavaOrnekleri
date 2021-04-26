import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("SMTcoder");
		System.out.println("");
		System.out.println("Zar Atma oyunu");
		int sayi1 = (int)(Math.random()*6+1);
		int sayi2 = (int)(Math.random()*6+1);
		System.out.println("(" + sayi1+")"+"("+sayi2+")"  );
		
		int toplam;
		toplam = sayi1 + sayi2;
		System.out.println("Toplamý : " + toplam);
		
		System.out.println("");
		
		
		Scanner s = new Scanner(System.in);
		int gamerPoint =0;
		int robotPoint=0;
		
		System.out.println("Taþ kaðýt makas oyununa hoþ geldiniz!");
		System.out.println("1-Taþ 2-Kaðýt 3-Makas");
		
		while(true) {
		System.out.println("Seçiminiz: ");
		
		int gamer = s.nextInt();
		int robot = (int)(Math.random()*3);
		
		if (gamer == 1) {
		if (robot == 1) {
		System.out.println("Bilgisayarýn seçimi: Taþ Sonuç: Berabere :/");
		System.out.println("Puanýnýz: "+gamerPoint+" Bilgisayarýn puaný:"+robotPoint);
		
		} else if (robot == 2) {
		System.out.println("Bilgisayarýn seçimi: Kaðýt Sonuç: Kaybettiniz :( ");
		gamerPoint++;
		System.out.println("Puanýnýz: "+gamerPoint+" Bilgisayarýn puaný:"+robotPoint);
		
		} else {
		System.out.println("Bilgisayarýn seçimi: Makas Sonuç: Kazandýnýz :)");
		gamerPoint++;
		System.out.println("Puanýnýz: " + gamerPoint + " Bilgisayarýn puaný:" + robotPoint);
		}
		
		} else if (gamer == 2) {
		if (robot == 1) {
		System.out.println("Bilgisayarýn seçimi: Taþ Sonuç : Kazandýnýz :)");
		gamerPoint++;
		System.out.println("Puanýnýz: "+gamerPoint+" Bilgisayarýn puaný:"+robotPoint);
		
		} else if (robot == 2) {
		System.out.println("Bilgisayarýn seçimi: Kaðýt Sonuç : Berabere :/");
		System.out.println("Puanýnýz: "+gamerPoint+" Bilgisayarýn puaný:"+robotPoint);
		} else {
		System.out.println("Bilgisayarýn seçimi: Makas Sonuç : Kaybettiniz :(");
		robotPoint++;
		System.out.println("Puanýnýz: " + gamerPoint + " Bilgisayarýn puaný:" + robotPoint); }
		} else if (gamer == 3) {
		if (robot == 1) {
		System.out.println("Bilgisayarýn seçimi: Taþ Sonuç : Kaybettiniz :(");
		robotPoint++;
		System.out.println("Puanýnýz: "+gamerPoint+" Bilgisayarýn puaný:"+robotPoint);
		} else if (robot == 2) {
		System.out.println("Bilgisayarýn seçimi: Kaðýt Sonuç : Kazandýnýz :)");
		gamerPoint++;
		System.out.println("Puanýnýz: "+gamerPoint+" Bilgisayarýn puaný:"+robotPoint);
		} else  {
		System.out.println("Bilgisayarýn seçimi: Makas Sonuç : Berabere :/");
		System.out.println("Puanýnýz: " + gamerPoint + " Bilgisayarýn puaný:" + robotPoint);
		}
		}
		
		else{
		System.out.println("Hatalý giriþ yaptýnýz tekrar deneyin");
		continue;}
		
		
		if(gamerPoint==3){
		System.out.println("Oyunu "+gamerPoint+"-"+robotPoint+" kazandýnýz :)");
		break; }
		else if(robotPoint==3){
		System.out.println("Oyunu "+robotPoint+"-"+gamerPoint+" kaybettiniz :(");
		break; }
		}
		
		
		
	}
}

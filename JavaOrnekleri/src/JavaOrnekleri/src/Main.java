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
		System.out.println("Toplam� : " + toplam);
		
		System.out.println("");
		
		
		Scanner s = new Scanner(System.in);
		int gamerPoint =0;
		int robotPoint=0;
		
		System.out.println("Ta� ka��t makas oyununa ho� geldiniz!");
		System.out.println("1-Ta� 2-Ka��t 3-Makas");
		
		while(true) {
		System.out.println("Se�iminiz: ");
		
		int gamer = s.nextInt();
		int robot = (int)(Math.random()*3);
		
		if (gamer == 1) {
		if (robot == 1) {
		System.out.println("Bilgisayar�n se�imi: Ta� Sonu�: Berabere :/");
		System.out.println("Puan�n�z: "+gamerPoint+" Bilgisayar�n puan�:"+robotPoint);
		
		} else if (robot == 2) {
		System.out.println("Bilgisayar�n se�imi: Ka��t Sonu�: Kaybettiniz :( ");
		gamerPoint++;
		System.out.println("Puan�n�z: "+gamerPoint+" Bilgisayar�n puan�:"+robotPoint);
		
		} else {
		System.out.println("Bilgisayar�n se�imi: Makas Sonu�: Kazand�n�z :)");
		gamerPoint++;
		System.out.println("Puan�n�z: " + gamerPoint + " Bilgisayar�n puan�:" + robotPoint);
		}
		
		} else if (gamer == 2) {
		if (robot == 1) {
		System.out.println("Bilgisayar�n se�imi: Ta� Sonu� : Kazand�n�z :)");
		gamerPoint++;
		System.out.println("Puan�n�z: "+gamerPoint+" Bilgisayar�n puan�:"+robotPoint);
		
		} else if (robot == 2) {
		System.out.println("Bilgisayar�n se�imi: Ka��t Sonu� : Berabere :/");
		System.out.println("Puan�n�z: "+gamerPoint+" Bilgisayar�n puan�:"+robotPoint);
		} else {
		System.out.println("Bilgisayar�n se�imi: Makas Sonu� : Kaybettiniz :(");
		robotPoint++;
		System.out.println("Puan�n�z: " + gamerPoint + " Bilgisayar�n puan�:" + robotPoint); }
		} else if (gamer == 3) {
		if (robot == 1) {
		System.out.println("Bilgisayar�n se�imi: Ta� Sonu� : Kaybettiniz :(");
		robotPoint++;
		System.out.println("Puan�n�z: "+gamerPoint+" Bilgisayar�n puan�:"+robotPoint);
		} else if (robot == 2) {
		System.out.println("Bilgisayar�n se�imi: Ka��t Sonu� : Kazand�n�z :)");
		gamerPoint++;
		System.out.println("Puan�n�z: "+gamerPoint+" Bilgisayar�n puan�:"+robotPoint);
		} else  {
		System.out.println("Bilgisayar�n se�imi: Makas Sonu� : Berabere :/");
		System.out.println("Puan�n�z: " + gamerPoint + " Bilgisayar�n puan�:" + robotPoint);
		}
		}
		
		else{
		System.out.println("Hatal� giri� yapt�n�z tekrar deneyin");
		continue;}
		
		
		if(gamerPoint==3){
		System.out.println("Oyunu "+gamerPoint+"-"+robotPoint+" kazand�n�z :)");
		break; }
		else if(robotPoint==3){
		System.out.println("Oyunu "+robotPoint+"-"+gamerPoint+" kaybettiniz :(");
		break; }
		}
		
		
		
	}
}

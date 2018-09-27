import java.util.Scanner;
import java.lang.Math;
public class kahviSetti {
						// @author Santeri Kilpeläinen
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
		// juomaAutomaatin luonti
		juomaAutomaatti omaKone = new juomaAutomaatti();
		
		// Scannerin luonti
		Scanner tilaus = new Scanner(System.in);

		
		// Tekstipohjainen UI ja looppaus
		while(true) {
		
		// Joka tilauksen alussa arpoo numeron joka päättää tilauksen toimimisen
		int random = (int)(Math.random() * 100+1);
		
		// UI
		System.out.println("***Juoma-Automaatti***\n");
		System.out.println("1. Kahvi\n2. Tee\n3. Kaakao\n4. Sammuta kone"
				+ "\n*****************");
		int order = tilaus.nextInt();
		
		// Tilausten suoritus
		if (order == 1 && random > 25) {
			System.out.println("Odota hetki, kahvianne valmistetaan...\n");
			Thread.sleep(1500);
			omaKone.valmistaKahvi();
			System.out.println(omaKone);
			}
		
		else if (order == 2 && random > 25) {
			System.out.println("Odota hetki, teetänne valmistetaan...\n");
			Thread.sleep(1500);
			omaKone.valmistaTee();
			System.out.println(omaKone); }
		
		else if (order == 3 && random > 25) {
			System.out.println("Odota hetki, kaakaotanne valmistetaan...\n");
			Thread.sleep(1500);
			omaKone.valmistaKaakao();
			System.out.println(omaKone); }
		
		else if (order == 4) {
			System.out.println("Sammutetaan");
			System.out.println("3");
			Thread.sleep(500);
			System.out.println("2");
			Thread.sleep(500);
			System.out.println("1");
			Thread.sleep(500);
			break; }
		
		else if (order < 4 && random <= 25) {
			System.out.println("Kiitos kahvirahoistasi, kone tilttasi. Error code: " + random + "\n");
			Thread.sleep(500);
			System.out.println("Käynnistetään uudelleen");
			Thread.sleep(500);
		}
		
		}
	}
  }
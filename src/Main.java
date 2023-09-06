import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		String vastaus = null;
		String raha;
		
		int nro1;
		int nro2;
		int nro3;
		int rahat;
		
		System.out.println("Kuinka suurella summalla haluat pelata?(kirjoita numero)");
		raha = in.nextLine();
		rahat = Integer.parseInt(raha);
do {
	nro1 = random.nextInt(10)+1;
	nro2 = random.nextInt(10)+1;
	nro3 = random.nextInt(10)+1;
	System.out.println("sinulla on nyt " +rahat+ " rahaa");
	
	if(rahat > 0 ) {
	System.out.println("Arvoit seuraavat numerot! " + nro1 +" "+ nro2 +" "+nro3);
	}
	else {
	break;
	}
	
	if(nro1 == 7 && nro2 == 7 && nro3 == 7){
	System.out.println("Voitit 10 rahaa!");
	rahat = rahat + 9;
	}
	else if(nro1 == 7 && nro2 == 7 || nro1 == 7 && nro3 == 7 || nro2 == 7 && nro3 == 7) {
		System.out.println("Voitit 3 rahaa!");
		rahat = rahat+2; 
		//nro1 == 7 && nro2 == 7 && nro3 == 7)
	}
	else if (nro1 == 7 || nro2 == 7 || nro3 == 7) {
		System.out.println("Voitit 1 rahan!");
		
		
	}
	
	else {
	rahat--;
	System.out.println("Hävisit pelin");
	
	
	}
	System.out.println("Sinulla on " + rahat +" Rahaa");
	System.out.println("haluatko pelata uudestaan?\nLopettaa voit kirjoittamalla N");
	vastaus = in.nextLine();
	
}  while (rahat == 0 || !vastaus.equals("N"));
if(vastaus.equals("N"));
{System.out.println("Kiitos kun pelasin!");
}

	}
}




package controller;

import java.util.Scanner;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		UpdateController controller = new UpdateController();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite id: ");
		    String idDrzava = scanner.nextLine();
		System.out.println("Unesite ime drzave: ");
		    String nazivDrzave = scanner.nextLine();
		    scanner.close();
		controller.proslediParametre(idDrzava, nazivDrzave);
			
		
		
		
		
		
		
	}

}

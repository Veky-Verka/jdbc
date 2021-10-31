package view;

import java.util.Scanner;

import controller.SelectController;

public class ViewForSelect {

	public static void main(String[] args) {
		
		SelectController controller = new SelectController();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite broj indexa: ");
		  String index = scanner.nextLine();
		scanner.close();
		
		int idStudent = controller.vratiIdStudent(index);
		
		if(idStudent != 0) {
		   System.out.println("Id studenta ciji je index " + index + " je " + idStudent);
		}else {
		   System.out.println("Nepostojeci index, pokusajte ponovo..");
		}

	}

}

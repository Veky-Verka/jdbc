package controller;

import dao.FakultetSqlLogic;
import model.Student;
import service.Service;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		Service service = new Service();
		
		String ime = "Petar";
		String prezime = "Petrovic 2";
		int index = 679;
		int smer = 4;
		int drzava = 1;
		int ispiti = 5;
		String imeDrzave = "Kanada";
		
		service.posaljiPozdrav();
		Student student = service.setujStudenta(ime,prezime,index,drzava,smer,ispiti);
		service.unesiStudentaUbazu(student); 
		service.unesiDrzavuUbazu(imeDrzave);
		
	}

}

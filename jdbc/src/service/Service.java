package service;

import dao.FakultetSqlLogic;
import metode.CommonMethods;
import model.Student;

public class Service {
	
	FakultetSqlLogic logic = new FakultetSqlLogic();
	CommonMethods common = new CommonMethods();
	
	public void unesiStudentaUbazu(Student student) {
		logic.unesiStudenta(student);
		
	}

	public void unesiDrzavuUbazu(String imeDrzave) {
		logic.unesiDrzavu(imeDrzave);
		
	}

	public void posaljiPozdrav() {
		common.pozdrav();
	}

	public Student setujStudenta(String ime, String prezime, int index, int drzava, int smer, int ispiti) {
		
		return common.setStudent(ime, prezime, index, drzava, smer, ispiti);
	}
	

}

package metode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.Student;

public class CommonMethods {
	       //stavicemo static za metodu da ne mora da se pravi objekat
	public static Connection konektujSe (String imeBaze) throws SQLException {
		   //ovde se buni, jer mora da se importuje 
		   //na kraju stavljamo final ispred svakog stringa
		   //i to se zove konstanta
		   //a za metodu stavljamo static
		   //i onda ne mora da se pravi objekat
		final String user = "root";
		final String pasword = "root";
		final String url = "jdbc:mysql://localhost:3306/" + imeBaze;
		    
		return DriverManager.getConnection(url, user, pasword);
		    //ovde se opet buni jer try chath ima exceptions.
		    //ima dve oopcije.
		    //prva je da ovaj DriverMenager stavimo u try chach (Surround...)
		    //a druga je da onaj ko poziva ovu metodu resava i exeptions
		    //zato stavljamo add throws declaration
		    //i on sam dodaje u return:
		    //throws SQL Exception
		
	}
	
	public void pozdrav() {
		System.out.println("Pozdrav iz nase aplikacije");
	}
	
	public Student setStudent(String ime, String prezime, int index, int drzava, int smer, int ispiti) {
		
		Student student = new Student();
		   student.setIme(ime);
		   student.setPrezime(prezime);
		   student.setBrojIndexa(index);
		   student.setSmer(smer);
		   student.setDrzava(drzava);
		   student.setIspiti(ispiti);
		   
		   return student;
		   
		   
	}
	
	

}

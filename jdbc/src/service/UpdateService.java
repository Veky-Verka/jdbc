package service;

import dao.FakultetSqlLogic;
import metode.CommonMethods;
import model.Drzava;

public class UpdateService {
	
	CommonMethods common = new CommonMethods();
	FakultetSqlLogic logic = new FakultetSqlLogic();

    public Drzava setujDrzavu(String idDrzava, String nazivDrzave) {
		return common.setujDrzavu(idDrzava, nazivDrzave);
		}

	public void updateNazivDrzave(Drzava drzava) {
		logic.updateNazivDrzave(drzava);
	}
	
	

}

package controller;

import model.Drzava;
import service.UpdateService;

public class UpdateController {
	
	UpdateService service = new UpdateService();

	public void proslediParametre(String idDrzava, String nazivDrzave) {
		
		Drzava drzava = service.setujDrzavu(idDrzava, nazivDrzave);
		
		service.updateNazivDrzave (drzava);
		
	}
	
}

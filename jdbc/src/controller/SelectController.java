package controller;

import service.SelectService;

public class SelectController {
	
	SelectService service = new SelectService();

	public int vratiIdStudent(String index) {
		return service.vratiIdStudent(index);
	}

	

}

package service;

import dao.FakultetSqlLogic;
import metode.CommonMethods;

public class SelectService {
	
	CommonMethods common = new CommonMethods();
	FakultetSqlLogic logic = new FakultetSqlLogic();
	
	public int vratiIdStudent(String index) {
		return logic.vratIdStudent(index);
	}
	
	


}

package model.services;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {

	private DepartmentDao dao = DaoFactory.createDepartmetDao();
	
	public List<Department> findAll() {
		//MOCK - dados de mentira não e do banco de dados ainda.
		//List<Department> list = new ArrayList<>();
		//list.add(new Department(1,"Books"));
		//list.add(new Department(2,"Computers"));
		//list.add(new Department(3,"Eletronics"));
		//return list;
		return dao.findAll();
	}
	
	public void saveOrUpdate(Department obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	
	public void remove(Department obj) {
		dao.deleteById(obj.getId());
	}
	
}

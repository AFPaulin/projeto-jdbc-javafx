package model.services;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerService {

	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll() {
		//MOCK - dados de mentira não e do banco de dados ainda.
		//List<Department> list = new ArrayList<>();
		//list.add(new Department(1,"Books"));
		//list.add(new Department(2,"Computers"));
		//list.add(new Department(3,"Eletronics"));
		//return list;
		return dao.findAll();
	}
	
	public void saveOrUpdate(Seller obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
	
}

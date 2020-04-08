package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department FindByID ===");
		Department department = departmentDao.findById(1);
		System.out.println("ID: " + department.getId());
		
		System.out.println("\n=== TEST 2: Department FindAll ===");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: Department Update ===");
		department.setName("Pizzaria");
		departmentDao.update(department);
		
		System.out.println("\n=== TEST 4: Department Insert ===");
		Department obj = new Department(null, "RH");
		departmentDao.insert(obj);
		
		System.out.println("\n=== TEST 5: Department Delete ===");
		departmentDao.deleteById(6);
		
		
		
	}

}

package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class ExSellerFindAll {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller FindByID ===");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Seller FindByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: Seller FindAll ===");
		List<Seller> list2 = sellerDao.findAll();
		
		list2.forEach(System.out::println);
		
	}

}

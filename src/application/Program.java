package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entiites.Department;
import model.entiites.Seller;

public class Program {

	public static void main(String[] args) {
		    
	    SellerDao sellerDao = DaoFactory.createSellerDao();
	
	    Seller seller = sellerDao.findById(3);
	    
	    System.out.println(seller);
	}

}

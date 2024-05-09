package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoImplJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao () {
		return new SellerDaoImplJDBC(DB.getConnection());
		
	}
	
	public static DepartmentDao createDepartmentDao () {
		return new DepartmentDaoJDBC(DB.getConnection());
		
	}
}

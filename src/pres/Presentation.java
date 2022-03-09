package pres;


import dao.DaoImp2;
import metier.MetierImpl;

public class Presentation {
	
	public static void main(String[] args) {
	/*
	 * injection des dependances 
	 * par  static -> new 
	 */
		DaoImp2 dao=new DaoImp2();
		
		MetierImpl metier =new MetierImpl();
		
		metier.setDao(dao);
		System.out.println("resultat :K=> "+metier.calcul());
	}
	
}

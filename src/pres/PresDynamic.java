package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class PresDynamic {

	public static void main(String[] args) throws Exception {
/*
 * FileNotFoundException, 
 * ClassNotFoundException, 
 * InstantiationException
 * , IllegalAccessException
 */
		Scanner scanner = new Scanner(new File("config.txt"));
		
		String daoClassName=scanner.nextLine();
		Class<?> cDao=Class.forName(daoClassName);
		IDao dao=(IDao)cDao.getDeclaredConstructor().newInstance();
		/*
		 * framework §!! copy /paste
		 */
		String metierClassName=scanner.nextLine();
		Class<?> cMetier=Class.forName(metierClassName);
		IMetier metier=(IMetier)cMetier.getDeclaredConstructor().newInstance();
		
	//	System.out.println(dao.getData());
		
		Method m =cMetier.getMethod("setDao",IDao.class);
		//metier.SetDao(Dao);
		m.invoke(metier, dao);
		
		System.out.println("Resultat K=>"+metier.calcul());
		
	}

}

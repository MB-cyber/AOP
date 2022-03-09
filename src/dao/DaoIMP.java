package dao;

public class DaoIMP implements IDao {

	@Override
	public double getData() {
		/*
		 Se connecter a la DB récupérer la temperature 
		 */
		System.out.println(" Version DB");
		double temp=Math.random();
		return temp;
	}

}

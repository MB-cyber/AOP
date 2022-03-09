package dao;

public class DaoImp2 implements IDao {

	@Override
	public double getData() {
		System.out.println(" Version Capteur");
		double temp=8000;
		return temp;
	}

}

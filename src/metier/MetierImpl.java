package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
	// le couplage faible dao de type interface ne depend pas la class daoIMP
	private IDao dao;
	
	@Override
	public double calcul() {
		
		double tmp=dao.getData();
		double res=tmp+273.15;
		return res;
	}
	
	// dao=null 
/*		
 * Injecter dans dao un objet 
 * d'une class qui implement une interface IDao
 */
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}

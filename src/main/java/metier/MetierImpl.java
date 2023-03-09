package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;
    @Override
    public double calcul() {
        double tmp = dao.getData();

        return tmp*1.5;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

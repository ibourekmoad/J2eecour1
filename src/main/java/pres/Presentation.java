package pres;

import dao.DaoImpl;
import dao.DaoImpl2;
import metier.MetierImpl;

public class  Presentation {
    public static void main(String[] args) {

        DaoImpl2 dao2 = new DaoImpl2();
        //DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao2);
        System.out.println(String.format("%.1f",metier.calcul()));
    }
}

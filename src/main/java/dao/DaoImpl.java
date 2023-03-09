package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {

        double temp = Math.random()*10;
        System.out.println("Version 1");
        return temp;
    }
}

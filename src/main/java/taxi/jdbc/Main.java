package taxi.jdbc;

import java.util.List;
import taxi.jdbc.dao.ManufacturerDao;
import taxi.jdbc.dao.ManufacturerDaoImpl;
import taxi.jdbc.model.Manufacturer;

public class Main {
    public static void main(String[] args) {
        ManufacturerDao manufacturerDao = new ManufacturerDaoImpl();
        List<Manufacturer> manufacturers = manufacturerDao.getAll();
        for (Manufacturer manufacturer : manufacturers) {
            System.out.println(manufacturer);
        }
        manufacturerDao.create(new Manufacturer("Ntesr", "Ctest"));
    }
}

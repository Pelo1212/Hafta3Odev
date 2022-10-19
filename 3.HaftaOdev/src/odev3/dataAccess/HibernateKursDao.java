package odev3.dataAccess;

import odev3.entities.Kurs;

public class HibernateKursDao implements KursDao {

	@Override
	public void add(Kurs kurs) {
		System.out.println("hibernate ile eklendi");
		
	}

}

package odev3.dataAccess;

import odev3.entities.Egitmen;

public class HibernateEgitmenDao implements EgitmenDao {

	@Override
	public void add(Egitmen egitmen) {
		System.out.println("hibernate ile eklendi");
		
	}

}

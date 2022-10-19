package odev3.dataAccess;

import odev3.entities.Egitmen;

public class JdbsEgitmenDao implements EgitmenDao{

	@Override
	public void add(Egitmen egitmen) {
		System.out.println("Jdbs ile eklendi");
		
	}

}

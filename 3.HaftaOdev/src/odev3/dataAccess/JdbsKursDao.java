package odev3.dataAccess;

import odev3.entities.Kurs;

public class JdbsKursDao implements KursDao{

	@Override
	public void add(Kurs kurs) {
		System.out.println("Jdbs ile eklendi");
		
	}

}

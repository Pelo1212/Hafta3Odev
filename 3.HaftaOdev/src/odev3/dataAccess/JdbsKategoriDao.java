package odev3.dataAccess;

import odev3.entities.Kategori;

public class JdbsKategoriDao implements KategoriDao{

	@Override
	public void add(Kategori kategori) {
		System.out.println("Jdbs ile eklendi");
		
	}

}

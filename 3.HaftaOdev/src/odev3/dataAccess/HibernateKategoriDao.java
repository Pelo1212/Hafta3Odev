package odev3.dataAccess;

import odev3.entities.Kategori;

public class HibernateKategoriDao implements KategoriDao {

	@Override
	public void add(Kategori kategori) {
		System.out.println("hibernate ile eklendi");
	}

}

package odev3;

import java.util.logging.Logger;

import odev3.business.EgitmenManager;
import odev3.business.KategoriManager;
import odev3.business.KursManager;
import odev3.core.logging.DatabaseLogger;
import odev3.core.logging.FileLogger;
import odev3.core.logging.MailLogger;
import odev3.dataAccess.HibernateKategoriDao;
import odev3.dataAccess.JdbsEgitmenDao;
import odev3.dataAccess.JdbsKursDao;
import odev3.entities.Egitmen;
import odev3.entities.Kategori;
import odev3.entities.Kurs;

public class Main {

	public static void main(String[] args) {
		
	Kurs kurs1=new Kurs("algoritma","java","phyton");
	Kurs[] kurslar = {};
	
	Egitmen egitmen= new Egitmen("engin");
	
	Kategori kategori2=new Kategori("programlama");
	Kategori []kategoriler ={ };
	
	
	Logger[] loggers = {new FileLogger(), new DatabaseLogger(),  new MailLogger()};

		
		KursManager kursManager = new KursManager(new JdbsKursDao(), kurslar, loggers);
		kursManager.add(kurs1);
		
		
		EgitmenManager egitmenManager = new EgitmenManager(new JdbsEgitmenDao(), loggers);
		egitmenManager.add(egitmen);
		
		KategoriManager kategoriManager = new KategoriManager(new HibernateKategoriDao(), kategoriler, loggers);
		kategoriManager.add(kategori2);
	}

}

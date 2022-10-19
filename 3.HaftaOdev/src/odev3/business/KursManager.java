package odev3.business;

import java.util.logging.Logger;

import odev3.dataAccess.KursDao;
import odev3.entities.Kurs;

public class KursManager {
	private KursDao kursDao;
	private Kurs[] kurslar;
	private Logger[] loggers;
	
	public KursManager(KursDao kursDao, Kurs[] kurslar, Logger[] loggers) {
		this.kursDao = kursDao;
		this.kurslar = kurslar;
		this.loggers = loggers;
	}
	
	public void add(Kurs kurs) throws Exception {
		if(kurs.getKursFiyat() < 0 ) {
			throw new Exception("kursun fiyatı sıfırdan küçük olamaz.");
		}
		else {
			for(Kurs kurs1 : kurslar) {
				if(kurs1.getKursAdı() == kurs.getKursAdı()) {
					throw new Exception("birden fazla aynı isimde kurs olamz.");
				}
			}
		}
		
		kursDao.add(kurs);
		for(Logger logger : loggers) {
			logger.log(kurs.getKursAdı());
		}	
	}
}

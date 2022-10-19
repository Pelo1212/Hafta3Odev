package odev3.business;

import java.util.logging.Logger;

import odev3.dataAccess.EgitmenDao;
import odev3.entities.Egitmen;

public class EgitmenManager {
	
	private EgitmenDao egitmenDao;
	private Logger[] loggers;
	private EgitmenDao egitmenDao2;
	
	public EgitmenDao getEgitmenDao() {
		return egitmenDao;
	}
	public void setEgitmenDao(EgitmenDao egitmenDao) {
		this.egitmenDao = egitmenDao;
	}
	
	public EgitmenManager(EgitmenDao egitmenDao, Logger[] loggers) {
		
		this.setEgitmenDao(egitmenDao);
		this.loggers = loggers;
	}
	public void add(Egitmen egitmen) {
		egitmenDao2 = null;
		egitmenDao2.add(egitmen);
		for(Logger logger : loggers) {
			logger.log(egitmen.getEgitmenAdı());
		}	
	}
	
}

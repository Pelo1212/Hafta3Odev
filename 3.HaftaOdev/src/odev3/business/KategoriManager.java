package odev3.business;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


import odev3.dataAccess.KategoriDao;
import odev3.entities.Kategori;

public class KategoriManager {

	private KategoriDao kategoriDao;
	private Logger [] loggers;
	
	  private List<Kategori> kategoriler = new ArrayList<Kategori>();
	
	public KategoriManager(KategoriDao kategoriDao, Object kategoriler2, Logger[] loggers) {
		
		this.kategoriDao = kategoriDao;
		this.loggers = loggers;
	}

	public void add(Kategori kategori)throws Exception{
	
	 for(Kategori kategori2:kategoriler) {
       
		 if(kategori2.getKategoriAdı()==kategori.getKategoriAdı()) {
			 throw new Exception("birden fazla aynı kategori bulunamaz");
		 
		 }}
		kategoriDao.add(kategori);
			for(Logger logger : loggers) {
				logger.log (kategori.getKategoriAdı());
	 }
	}}
	
	
	
	
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	
	
	
	



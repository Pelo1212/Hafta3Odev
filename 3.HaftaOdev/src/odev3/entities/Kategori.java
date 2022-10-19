package odev3.entities;

import java.util.logging.LogRecord;

public class Kategori {
	
	 private LogRecord kategoriAdı;

	public Kategori(LogRecord kategoriAdı) {
		
		this.kategoriAdı = kategoriAdı;
	}

	
	public Kategori(String string) {
		// TODO Auto-generated constructor stub
	}


	public LogRecord getKategoriAdı() {
		return  kategoriAdı;
	}

	public void setKategoriAdı(LogRecord kategoriAdı) {
		this.kategoriAdı = kategoriAdı;
	}
	

}

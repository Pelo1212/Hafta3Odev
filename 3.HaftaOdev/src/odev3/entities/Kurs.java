package odev3.entities;

import java.util.logging.LogRecord;

public class Kurs  {
	
	private double unitPrice;
	private LogRecord kursAdı;
	
	public Kurs(String string, String string2, String string3) {
	}

	
	public Kurs(double string, String string2, LogRecord kursAdı) {
	
		this.unitPrice = string;
	
		this.kursAdı = kursAdı;
	}
	
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public LogRecord getKursAdı() {
		return kursAdı;
	}
	public void setKursAdı(LogRecord kursAdı) {
		this.kursAdı = kursAdı;
	}


	public int getKursFiyat() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

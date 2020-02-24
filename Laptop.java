package file;

import java.io.Serializable;

public class Laptop implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String company;
	private int HD;
	private int processsor;
	public Laptop(String company, int hD, int processsor) {
		super();
		this.company = company;
		HD = hD;
		this.processsor = processsor;
	}
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", HD=" + HD + ", processsor=" + processsor + "]";
	}
	

}

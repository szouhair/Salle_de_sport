package pack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seance {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int numSeance;
	
	
	public String choix;
	
	public String value;
	
	
	public Seance(String choix) {
		this.choix = choix;
	}

	public Seance() {}

	public int getNumSeance() {
		return numSeance;
	}

	public void setNumSeance(int numSeance) {
		this.numSeance = numSeance;
	}

	public String getChoix() {
		return choix;
	}

	public void setChoix(String choix) {
		this.choix = choix;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}

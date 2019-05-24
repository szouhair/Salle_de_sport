package pack;

import java.beans.Transient;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SeanceCoach {

	
	@Id

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int Id;
	
	
	public int idCoach;
	
	
	public Integer NumSeances;
	
	
	public SeanceCoach() {
	}


	public SeanceCoach(int idCoach, Integer numSeances) {
		this.idCoach = idCoach;
		NumSeances = numSeances;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public int getIdCoach() {
		return idCoach;
	}


	public void setIdCoach(int idCoach) {
		this.idCoach = idCoach;
	}


	public Integer getNumSeances() {
		return NumSeances;
	}


	public void setNumSeances(Integer numSeances) {
		NumSeances = numSeances;
	}

	
	
	
}

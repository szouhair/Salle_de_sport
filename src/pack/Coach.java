package pack;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
//@Table(name = "CoachMdp")
public class Coach {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int numCoach;

	//@Column(name = "Identifiant")
	private String Identifiant;

	//@Column(name = "mdp")
	private String mdp;

	public Coach() {}
	@ManyToMany(mappedBy="coachs")
	List<Client> abones;

	public Coach(String identifiant, String mdp) {
		Identifiant = identifiant;
		this.mdp = mdp;
	}



	public int getNumCoach() {
		return numCoach;
	}

	public void setNumCoach(int numCoach) {
		this.numCoach = numCoach;
	}

	public String getIdentifiant() {
		return Identifiant;
	}

	public void setIdentifiant(String identifiant) {
		Identifiant = identifiant;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public void sinscrire(String Id, String mdp) {
		this.setIdentifiant(Id);
		this.setMdp(mdp);

	}


}

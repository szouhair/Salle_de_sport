package pack;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
//@Table(name = "ClientMdp")
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int NumClient;


	//@Column(name = "Identifiant")
	private String Identifiant;

	//@Column(name = "mdp")
	private String mdp;

	public String abChoisi;

	public Client() {}
	@ManyToMany
	List<Coach> coachs;

	public Client(String usrn, String mdp1) {
		Identifiant = usrn;
		mdp = mdp1;
		abChoisi = "Empty";
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

	private void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public int getNumClient() {
		return NumClient;
	}

	public void setNumClient(int numClient) {
		NumClient = numClient;
	}

	public void sinscrire(String Id, String mdp) {
		this.setIdentifiant(Id);
		this.setMdp(mdp);

	}

	public String getAbChoisi() {
		return abChoisi;
	}

	public void setAbChoisi(String abChoisi) {
		this.abChoisi = abChoisi;
	}
}


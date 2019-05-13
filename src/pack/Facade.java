package pack;


import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Singleton
@LocalBean
public class Facade {


        @PersistenceContext
        EntityManager em;

        List<String> listChoix = new ArrayList<String>();

        public Client inscrire(String Id, String mdp) {
        	Client clienti = new Client(Id, mdp);
        	//client.sinscrire(Id,mdp);
        	em.persist(clienti);
        	return clienti;
        }

        public Coach inscrireCoach(String Id, String mdp) {
        	Coach coachi = new Coach(Id, mdp);
        	//client.sinscrire(Id,mdp);
        	em.persist(coachi);
        	return coachi;
        }

        public boolean clientbienidentifier(int id, String username, String mdp) {
        	//On suppose que le client ne se trompe pas sur son id
        	try {
        		Client client = em.find(Client.class, id);
            	String motdepasse = client.getMdp();
            	return motdepasse.equals(mdp);
        	}
        	catch (java.lang.NullPointerException e) {
        		e.printStackTrace();
        		return (1 == 0);
        	}

        }

        public boolean coachbienidentifier(int id, String username, String mdp) {
        	//On suppose que le client ne se trompe pas sur son id
        	try {
        		Coach coach = em.find(Coach.class, id);
            	String motdepasse = coach.getMdp();
            	return motdepasse.equals(mdp);
        	}
        	catch (java.lang.NullPointerException e) {
        		e.printStackTrace();
        		return (1 == 0);
        	}

        }

        public boolean Identifiantdispo(String username){
        	Query requete = em.createQuery("SELECT c FROM Client c WHERE c.Identifiant = :username");
        	requete.setParameter("username", username);
        	try{
        		Client client = (Client)requete.getSingleResult();
        	}
        	catch(NoResultException e){
        		return true;
        	}
        	return false;
        }

        public boolean IdentifiantCoachdispo(String username){
        	Query requete = em.createQuery("SELECT c FROM Coach c WHERE c.Identifiant = :username");
        	requete.setParameter("username", username);
        	try{
        		Coach coach = (Coach)requete.getSingleResult();
        	}
        	catch(NoResultException e){
        		return true;
        	}
        	return false;
        }

        public boolean clientbienidentifie(String username, String mdp){
        	Query requete = em.createQuery("SELECT c FROM Client c WHERE c.Identifiant = :username");
        	requete.setParameter("username", username);
        	try {
        		Client client = (Client) requete.getSingleResult();
               	String motdepasse = client.getMdp();
               	return motdepasse.equals(mdp);
            	}

        	catch (NoResultException e) {
        		return (1 == 0);
        	}
        	catch(IllegalArgumentException e){
        		return(1 == 0);
        	}
        }

        public boolean coachbienidentifie(String username, String mdp){
        	Query requete = em.createQuery("SELECT c FROM Coach c WHERE c.Identifiant = :username");
        	requete.setParameter("username", username);
        	try {
        		Coach coach = (Coach) requete.getSingleResult();
               	String motdepasse = coach.getMdp();
               	return motdepasse.equals(mdp);
            	}

        	catch (NoResultException e) {
        		return (1 == 0);
        	}
        	catch(IllegalArgumentException e){
        		return(1 == 0);
        	}
        }

        public boolean usernameDisponible(String username) {
        	return (!em.contains(username));
        }

        public boolean identifiantInscris(String username) {
        	return em.contains(username);
        }

        public Client inscrireAbonnement(int NC, String ab) {
        	Client client = em.find(Client.class, NC);
        	client.setAbChoisi(ab);
        	//em.merge(client);
        	em.refresh(client);
        	return client;
        }

        public int enregistrerChoix (String choix) {
        	Seance seancei = new Seance(choix);
        	em.persist(seancei);
        	return seancei.getNumSeance();
        }

        public String retournerChoix (int choixId) {
        	Seance seancei = em.find(Seance.class, choixId);
        	if (seancei == null) {
       			return "null";
       		}
        	else {
        		return seancei.getValue();
        		/**if (seancei.getValue().equals("0")) {
        			return "0";
        		}

        		else {
        			return "1";
        		} **/
        	}
        }

        /**public Client retournerClient(int NumClient) {
        	Client client = em.find(Client.class, NumClient);
        	return client;
        }
        **/
/*
public void ajouterPersonne(String nom, String prenom){
        Personne p = new Personne(nom, prenom);
        em.persist(p);
}

public void ajouterAdresse(String rue, String ville){
        Adresse a = new Adresse(rue, ville);
        em.persist(a);
}



public void associer(int idp, int ida){
        Personne p = em.find(Personne.class, idp);
        Adresse a = em.find(Adresse.class, ida);
        a.getPersons().add(p);
}

public Collection<Personne> listerPersonnes(){
        //return TP.values();
        TypedQuery<Personne> req = em.createQuery("select P from Personne p", Personne.class);
        return req.getResultList();
}

public Collection<Adresse> listerAdresses(){
        //return TA.values();
        TypedQuery<Adresse> req = em.createQuery("select A from Adresse a", Adresse.class);
        return req.getResultList();
}
*/
}
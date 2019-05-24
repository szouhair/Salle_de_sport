package pack;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class Serv
 */
@WebServlet("/Serv")
public class Serv extends HttpServlet {
        private static final long serialVersionUID = 1L;
        @EJB
        Facade facade;
    /**
     * Default constructor.
     */
    public Serv() {
        // TODO Auto-generated constructor stub
    }
    int NumC;

    public int getNumC() {
		return NumC;
	}

	public void setNumC(int numC) {
		NumC = numC;
	}

		/**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                String op = request.getParameter("op");
                switch(op){

                case "IdentificationClient":
                	System.out.println("1");
                	try {
                	String username = request.getParameter("username");
                	String mdp = request.getParameter("mdp");
                	if (facade.clientbienidentifie(username, mdp)) {
                		HttpSession session = request.getSession();
                		session.setAttribute("username", username);
                		//request.setAttribute("usernameClient", username);
                		request.getRequestDispatcher("ChoixFormule.jsp").forward(request, response);
                	}
                	else {
                		request.getRequestDispatcher("MdpIncorrect.html").forward(request, response);
                	}
                	}
                	catch (java.lang.IllegalArgumentException e1) {
                		request.getRequestDispatcher("MdpIncorrect.html").forward(request, response);
                	}


                case "IdentificationCoach":
                	System.out.println("1");
                	try {
                	String username1 = request.getParameter("username");
                	String mdp1 = request.getParameter("mdp");
                	//int IdC = Integer.parseInt(request.getParameter("IdCoach"));
                	if (facade.coachbienidentifie(username1, mdp1)) {
                		HttpSession session = request.getSession();
                		session.setAttribute("nomcoach", username1);
                		request.setAttribute("usernameC", username1);
                		request.getRequestDispatcher("AcceuilCoach.jsp").forward(request, response);
                	}
                	else {
                		request.getRequestDispatcher("MdpCoachIncorrect.html").forward(request, response);
                	}
                	}
                	catch (java.lang.IllegalArgumentException e1) {
                		request.getRequestDispatcher("MdpCoachIncorrect.html").forward(request, response);
                	}

                case "Inscription_Client":
                	String usernameClient = request.getParameter("username_Client"); ///////////ATTENTION/////////
                	String mdpClient = request.getParameter("mdp_Client"); ///////////ATTENTION/////////
               		String mdp2 = request.getParameter("mdp2_Client"); ///////////ATTENTION/////////
               		if (!facade.Identifiantdispo(usernameClient)){
                		request.getRequestDispatcher("IdentifiantPris.html").forward(request, response);
               		}
               		else{
               			if (mdpClient.equals(mdp2)){
               				Client Clientt = facade.inscrire(usernameClient, mdpClient);
               				request.setAttribute("username_Client", Clientt.getIdentifiant()); ///////////ATTENTION/////////
               				request.setAttribute("mdp_Client", Clientt.getMdp()); ///////////ATTENTION/////////
               				request.getRequestDispatcher("InscriptionReussie.jsp").forward(request, response);
               			}
               			else {
               				request.getRequestDispatcher("MdpMalSaisis.html").forward(request, response);
               			}
               		}


                case "Inscription_Coach":
                	String usernameCoach = request.getParameter("username_Coach"); ///////////ATTENTION/////////
                	String mdpCoach = request.getParameter("mdp_Coach"); ///////////ATTENTION/////////
                	String mdp3 = request.getParameter("mdp2_Coach"); ///////////ATTENTION/////////
                	if (!facade.IdentifiantCoachdispo(usernameCoach)){
                		request.getRequestDispatcher("IdentifiantPris.html").forward(request, response);
                	}
                	else{
                		if (mdpCoach.equals(mdp3)){
                			Coach Coachh = facade.inscrireCoach(usernameCoach, mdpCoach);
                			int i = Coachh.getNumCoach();
                			request.setAttribute("numcoach", i);
                			request.setAttribute("usernamecoach", Coachh.getIdentifiant());;
                			request.setAttribute("mdpcoach", Coachh.getMdp());
                			request.getRequestDispatcher("InscriptionReussieCoach.jsp").forward(request, response);

                		}
                		else {
                			request.getRequestDispatcher("MdpMalSaisis.html").forward(request, response);
                		}
                	}



                case "SignUpBasic":
                	//int numClient = Integer.parseInt(request.getParameter("n"));
                	//Client clienti = facade.inscrireAbonnement(numClient, "AbonnementBasique");
                	//facade.inscrireAbonnement(client,"AbonnementBasique");
                	List<String> listCh = new ArrayList<String>();
        			for (String ent : request.getParameterValues("ListeSe")) {
        				listCh.add(facade.retournerChoix(Integer.parseInt(ent)));
        			}
        			request.setAttribute("ListeDesChoix", listCh);
        			//request.setAttribute("nom", clienti.getIdentifiant());
                	request.getRequestDispatcher("InterfaceAbonnementBasique.jsp").forward(request, response);

                case "LogoutClient":
                	HttpSession session = request.getSession();
                	session.removeAttribute("username");
                	response.sendRedirect("Accueil.html");
                	
                case "LogoutCoach":
                	HttpSession session2 = request.getSession();
                	session2.removeAttribute("nomcoach");
                	response.sendRedirect("Accueil.html");


        		case "EnregistrerSonChoix":

        			String choix1 = (request.getParameter("choix1"));
        			String choix2 = request.getParameter("choix2");
        			String choix3 = request.getParameter("choix3");
        			String choix4 = request.getParameter("choix4");
        			String choix5 = request.getParameter("choix5");
        			String choix6 = request.getParameter("choix6");
        			String choix7 = request.getParameter("choix7");
        			String choix8 = request.getParameter("choix8");
        			String choix9 = request.getParameter("choix9");
        			String choix10 = request.getParameter("choix10");
        			String choix11 = request.getParameter("choix11");
        			String choix12 = request.getParameter("choix12");
        			String choix13 = request.getParameter("choix13");
        			String choix14 = request.getParameter("choix14");
        			String choix15 = request.getParameter("choix15");
        			String choix16 = request.getParameter("choix16");
        			String choix17 = request.getParameter("choix17");
        			String choix18 = request.getParameter("choix18");
        			String choix19 = request.getParameter("choix19");
        			String choix20 = request.getParameter("choix20");
        			String choix21 = request.getParameter("choix21");
        			String choix22 = request.getParameter("choix22");
        			String choix23 = request.getParameter("choix23");
        			String choix24 = request.getParameter("choix24");
        			String choix25 = request.getParameter("choix25");
        			String choix26 = request.getParameter("choix26");
        			String choix27 = request.getParameter("choix27");
        			String choix28 = request.getParameter("choix28");
        			String choix29 = request.getParameter("choix29");
        			String choix30 = request.getParameter("choix30");
        			String choix31 = request.getParameter("choix31");
        			String choix32 = request.getParameter("choix32");
        			String choix33 = request.getParameter("choix33");
        			String choix34 = request.getParameter("choix34");
        			String choix35 = request.getParameter("choix35");


        			List<String> choix = Arrays.asList(choix1,choix2,choix3,choix4,choix5,choix6,choix7,choix8,choix9,choix10,choix11,choix12,choix13,choix14,choix15,
        				   	choix16,choix17,choix18,choix19,choix20, choix21, choix22, choix23, choix24, choix25, choix26, choix27, choix28, choix29, choix30, choix31,
        			        choix32,choix33,choix34,choix35);

        			List<Integer> ListSea = new ArrayList<>();
        			HttpSession session3 = request.getSession();
        			String nomCoach = (String)session3.getAttribute("nomcoach");
        			//String nomCoach = request.getParameter("nameCoach");
        			System.out.println(nomCoach);
        			List<Integer> List_seance_Coach = new ArrayList<>();
        			int n1 = 0;
        			for (String choisi : choix) {
        				if (choisi == null) {
        					choisi = "0";
        				}
        				else {
        					if (choisi.equals("1")) {
        						choisi = "1";
        						int nSeance = facade.enregistrerCoachSeance(nomCoach, n1);
        						List_seance_Coach.add(nSeance);
        					}
        					else {
        						choisi = "0";
        					}
        				}
        				int i = facade.enregistrerChoix(choisi);
        				ListSea.add(i);
        				n1 = n1+1;
        			}
        			request.setAttribute("ListeSeance", ListSea);
        			//request.setAttribute("nCoach", nomCoach);
        			request.setAttribute("Lseance", List_seance_Coach);
        			request.getRequestDispatcher("RecapCoach.jsp").forward(request, response);

        					//boolList.add(1);
        					//int NumCoach = Integer.parseInt(request.getParameter("numC"));
        					//request.setAttribute("NumeroCoach", NumCoach);
        					//request.setAttribute("choisi", choisi);

        					//List<String> listCh= facade.listChoix;
                			//request.setAttribute("ListeDesChoix", listCh);




        }
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}


package pack;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
                		request.getRequestDispatcher("AcceuilClient.html").forward(request, response);
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
                	if (facade.coachbienidentifie(username1, mdp1)) {
                		request.getRequestDispatcher("AcceuilCoach.html").forward(request, response);
                	}
                	else {
                		request.getRequestDispatcher("MdpIncorrect.html").forward(request, response);
                	}
                	}
                	catch (java.lang.IllegalArgumentException e1) {
                		request.getRequestDispatcher("MdpIncorrect.html").forward(request, response);
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





        		case "EnregistrerSonChoix":

        			String choix1 = (request.getParameterValues("choix1"))[0];
        			String choix2 = request.getParameterValues("choix2")[0];
        			String choix3 = request.getParameterValues("choix3")[0];
        			String choix4 = request.getParameterValues("choix4")[0];
        			String choix5 = request.getParameterValues("choix5")[0];
        			String choix6 = request.getParameterValues("choix6")[0];
        			String choix7 = request.getParameterValues("choix7")[0];
        			String choix8 = request.getParameterValues("choix8")[0];
        			String choix9 = request.getParameterValues("choix9")[0];
        			String choix10 = request.getParameterValues("choix10")[0];
        			String choix11 = request.getParameterValues("choix11")[0];
        			String choix12 = request.getParameterValues("choix12")[0];
        			String choix13 = request.getParameterValues("choix13")[0];
        			String choix14 = request.getParameterValues("choix14")[0];
        			String choix15 = request.getParameterValues("choix15")[0];
        			String choix16 = request.getParameterValues("choix16")[0];
        			String choix17 = request.getParameterValues("choix17")[0];
        			String choix18 = request.getParameterValues("choix18")[0];
        			String choix19 = request.getParameterValues("choix19")[0];
        			String choix20 = request.getParameterValues("choix20")[0];
        			String choix21 = request.getParameterValues("choix21")[0];
        			String choix22 = request.getParameterValues("choix22")[0];
        			String choix23 = request.getParameterValues("choix23")[0];
        			String choix24 = request.getParameterValues("choix24")[0];
        			String choix25 = request.getParameterValues("choix25")[0];
        			String choix26 = request.getParameterValues("choix26")[0];
        			String choix27 = request.getParameterValues("choix27")[0];
        			String choix28 = request.getParameterValues("choix28")[0];
        			String choix29 = request.getParameterValues("choix29")[0];
        			String choix30 = request.getParameterValues("choix30")[0];
        			String choix31 = request.getParameterValues("choix31")[0];
        			String choix32 = request.getParameterValues("choix32")[0];
        			String choix33 = request.getParameterValues("choix33")[0];
        			String choix34 = request.getParameterValues("choix34")[0];
        			String choix35 = request.getParameterValues("choix35")[0];


        			List<String> choix = Arrays.asList(choix1,choix2,choix3,choix4,choix5,choix6,choix7,choix8,choix9,choix10,choix11,choix12,choix13,choix14,choix15,
        				   	choix16,choix17,choix18,choix19,choix20, choix21, choix22, choix23, choix24, choix25, choix26, choix27, choix28, choix29, choix30, choix31,
        			        choix32,choix33,choix34,choix35);

        			List<Integer> ListSea = new ArrayList<>();

        			for (String choisi : choix) {
        				if (choisi == null) {
        					choisi = "0";
        				}
        				else {
        					if (choisi.equals("1")) {
        						choisi = "1";
        					}
        					else {
        						choisi = "0";
        					}
        				}
        				int i = facade.enregistrerChoix(choisi);
        				ListSea.add(i);
        			}
        			request.setAttribute("ListeSeance", ListSea);

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


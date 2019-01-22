package serveur;

import javax.xml.ws.Endpoint;

import service.BanqueService;

/*
 * Cette application ouvre un service http  sur le port 8585
 * qui va être utiliser uniquement pour consulter le webservice 
 * BanqueService
 */

public class ServeurJWS {

	public static void main(String[] args) {
		/*
		 * On specifie le port, l'adresse d'accès
		 * localhost : le web service est accéssible qu'en locale
		 * Si on veut qu'il soit accéssible à distance on peut remplacer 
		 * localhost par l'adresse ip de notre machine, ou on 
		 * spécifie le nom de domaine
		 */
		String url = "http://localhost:8585/";
		
		/*
		 * Pour publier le webservice on utilise la classe Endpoint
		 * et la methode publish
		 */
		Endpoint.publish(url, new BanqueService());
		
		System.out.println(url);
	}

}

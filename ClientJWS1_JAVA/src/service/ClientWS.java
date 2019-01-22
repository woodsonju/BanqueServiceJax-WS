package service;

import java.util.List;

public class ClientWS {

	public static void main(String[] args) {
		
		/*
		 * Creation du proxy : 
		 * BanqueWS: Represente le stub, ou le proxy
		 * BanqueServiceService() : On crée une instance d'une classe service
		 */
		BanqueWS stub = new BanqueServiceService().getBanqueWSPort();
		
		double res = stub.conversionEuroToHTG(8000);
		System.out.println(res);
		
		Compte cp = stub.getCompte(1L);
		System.out.println(cp.getSolde());
		
		System.out.println("-----------------------");
		List<Compte> cptes = stub.getComptes();
		cptes.forEach(c -> {
			System.out.println(c.getCode());
			System.out.println(c.getSolde());
			System.out.println("------------");
		});
	}

}

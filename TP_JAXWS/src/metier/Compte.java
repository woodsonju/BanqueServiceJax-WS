package metier;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/*
 * @XmlRootElement : ici le message xml qu'on va générer portera
 * le nom compte
 */
@XmlRootElement
//Les annotations se feront sur les champs (attributs)
@XmlAccessorType(XmlAccessType.FIELD)  
public class Compte implements Serializable{
	
	private Long code;
	private double solde;
	
	/*
	 * Si on veut que la date de création ne soit pas envoyer au 
	 * client on utilise l'annotation @XmlTransient
	 * par defaut les annoations jaxB sont utilisés sur les getters
	 * pour l'utiliser sur un attribut on utilise l'annotation 
	 * @XmlAccessorType(XmlAccessType.FIELD)
	 */
	@XmlTransient
	private Date date;
	
	
	public Compte() {
		super();
	}

	public Compte(Long code, double solde, Date date) {
		super();
		this.code = code;
		this.solde = solde;
		this.date = date;
	}

	
	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

}

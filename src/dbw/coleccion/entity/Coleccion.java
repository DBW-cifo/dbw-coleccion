package dbw.coleccion.entity;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "euros") 
public class Coleccion {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
@Column(name = "idmoneda")
private int idmoneda;
@Column(name = "valor_nominal") 
private float valor_nominal;
@Column(name = "pais")
private String pais;
@Column(name = "año") 
private String año;
@Column(name = "ceca")
private String ceca;
@Column(name = "existe")
@NotNull(message = "No puede ser nulo")
@Pattern(regexp=("[SNsn]{1}" ),message="Indique si existe o no. Debe introducir S o N")
private String existe;
@Column(name = "tengo")
@NotNull(message = "No puede ser nulo")
@Pattern(regexp=("[SNsn]{1}" ),message="Indique si lo tengo o no. Debe introducir S o N")
private String tengo;
@Column(name = "valor_mercado") 
private float valor_mercado;

public Coleccion() {	

	super();
	listaPais=new LinkedHashMap<String,String>();
	listaPais.put("AND","AND");       	                           
	listaPais.put("ALE","ALE");
	listaPais.put("AUS","AUS");              	               
	listaPais.put("BEL","BEL");        
	listaPais.put("VAT","VAT");  
	listaPais.put("CHI","CHI"); 
	listaPais.put("ESQ","ESQ"); 
	listaPais.put("ESN","ESN");
	listaPais.put("ESP","ESP");
	listaPais.put("EST","EST");
	listaPais.put("FIN","FIN");
	listaPais.put("FRA","FRA");
	listaPais.put("GRE","GRE");
	listaPais.put("IRL","IRL");
	listaPais.put("ITA","ITA");
	listaPais.put("LET","LET");
	listaPais.put("LIT","LIT");
	listaPais.put("LUX","LUX");
	listaPais.put("MAL","MAL");
	listaPais.put("PAB","PAB");
	listaPais.put("POR","POR");
}
	
/*	listaAño=new LinkedHashMap<String,String>();
	listaAño.put("1999","1999");       	                           
	listaAño.put("2000","2000");
	listaAño.put("2001","2001");
	listaAño.put("2002","2002");
	listaAño.put("2003","2003");
	listaAño.put("2004","2004");
	listaAño.put("2005","2005");
	listaAño.put("2006","2006");
	listaAño.put("2007","2007");
	listaAño.put("2008","2008");
	listaAño.put("2009","2009");
	listaAño.put("2010","2010");
	listaAño.put("2011","2011");
	listaAño.put("2012","2012");
	listaAño.put("2013","2013");
	listaAño.put("2014","2014");
	listaAño.put("2015","2015");
	listaAño.put("2016","2016");
	listaAño.put("2017","2017");
	listaAño.put("2018","2018");
	listaAño.put("2019","2019");
	listaAño.put("2020","2020");
}*/

public Coleccion(float valor_nominal,
		         String pais,
		         String año,
		         String ceca,
		         String existe,
		         String tengo,
		         float valor_mercado) {
	super();
	this.valor_nominal = valor_nominal; 
	this.pais = pais; 
	this.año = año;
	this.ceca = ceca;
    this.existe = existe;
    this.tengo= tengo;
    this.valor_mercado= valor_mercado;
}

public int getIdmoneda() {
	return idmoneda;
}

public void setIdmoneda(int idmoneda) {
	this.idmoneda = idmoneda; 
}

public float getValor_nominal() {
	return valor_nominal;
}
public void setValor_nominal(float valor_nominal) {
	this.valor_nominal = valor_nominal;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}
@ElementCollection
private Map<String,String> listaPais;
public Map<String, String> getListaPais() {
    return listaPais;
}
public String getAño() {
	return año;
}
public void setAño(String año) {
	this.año = año;
}
/*@ElementCollection
private Map<String,String> listaAño;
public Map<String,String> getListaAño() {
    return listaAño;
}*/
public String getCeca() {
	return ceca;
}
public void setCeca(String ceca) {
	this.ceca = ceca;
}

public String getExiste() {
	return existe;
}
public void setExiste(String existe) {
	this.existe = existe;
}
public String getTengo() {
	return tengo;
}
public void setTengo(String tengo) {
	this.tengo = tengo;
}
public float getValor_mercado() {
	return valor_mercado;
}
public void setValor_mercado(float valor_mercado) {
	this.valor_mercado = valor_mercado;
}

@Override
public String toString() {
	return "Coleccion [idmoneda=" + idmoneda + 
			", valor_nominal=" + valor_nominal + 
			", pais=" + pais + 
			", año=" + año + 
			", ceca=" + ceca +
			", existe=" + existe +
			", tengo=" + tengo +
			", valor_mercado=" + valor_mercado + "]";
}
}
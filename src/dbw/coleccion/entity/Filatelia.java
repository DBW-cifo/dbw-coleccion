package dbw.filatelias.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "filatelias") 
public class Filatelia {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
@Column(name = "idfilatelia")
private int idfilatelia;
@Column(name = "nombre")
private String nombre;
@Column(name = "direccion") 
private String direccion;

public Filatelia() {	
}

public Filatelia(String nombre,
                 String direccion) {
	super();
	this.nombre = nombre; 
	this.direccion = direccion;
}

public int getIdfilatelia() {
	return idfilatelia;
}

public void setIdfilatelia(int idfilatelia) {
	this.idfilatelia = idfilatelia; 
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}

@Override
public String toString() {
	return "Coleccion [idfilatelia=" + idfilatelia + 
			", nombre=" + nombre + 
			", direccion=" + direccion + "]"; 			
}
}
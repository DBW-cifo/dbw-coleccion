package dbw.coleccion.testConDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
public static void main(String[] args) {
	
	String user = "root";
	String pass = "kGd25870";
	String bd="coleccion";
	
	String jdbcUrl = "jdbc:mysql://localhost:3306/"+bd+"?useSSL=false&serverTimezone=UTC";
	System.out.println("Todo bien. Circulen euros.");  	
try {		
	System.out.println("Conectando: " + jdbcUrl);
	Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
	Connection con = DriverManager.getConnection(jdbcUrl, user, pass);
	System.out.println("Todo bien. Circulen euros."+con); 
    }
catch (Exception exc) {
exc.printStackTrace();
}
}}
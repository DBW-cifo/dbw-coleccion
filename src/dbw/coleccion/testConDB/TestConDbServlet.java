package dbw.filatelias.testConDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
	
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	/**
	* Servlet implementation class TestConDbServlet 
	* */
	@WebServlet("/TestConDbServlet")
	public class TestConDbServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
    		* response)
    		*/
    		protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		       throws ServletException, IOException {
    		String cadConexion = "jdbc:mysql://localhost:3306/"; 
    		String bd = "filatelias";
    		String usuario = "root";
    		String pass = "kGd25870";
    		
    		try {
    		Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
    			Connection con = DriverManager.getConnection(cadConexion +
    		    bd+"?serverTimezone=UTC", usuario, pass);
    		System.out.println("Todo bien. Circulen con EUROS."+con); 
    		PrintWriter out =response.getWriter();
    		out.println("Todo bien. EUROS!!!"); 
    		con.close();
    		} 
    		catch (Exception e) { 
    			System.out.println(e);
    		} 
    		}
	
}
package dbw.coleccion.dao; 

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import dbw.coleccion.entity.Coleccion; 

@Repository
public class ColeccionDAO implements IColeccionDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Coleccion> getColeccion() {
	Session miSesion=sessionFactory.getCurrentSession();
	
		List<Coleccion> euros=miSesion.createQuery("from Coleccion",Coleccion.class).list();
		return euros; 
	}
	
	@Override
	public void save(Coleccion euro) {
		Session miSesion=sessionFactory.getCurrentSession(); 
		miSesion.saveOrUpdate(euro);
	}

	@Override
	public Coleccion getColeccion(int idmoneda) {
		Session miSesion=sessionFactory.getCurrentSession();
		return miSesion.get(Coleccion.class,idmoneda);
	}
	
	@Override
	public void delete(Coleccion euro) {
		Session miSesion=sessionFactory.getCurrentSession();
		miSesion.delete(euro);
	}
}
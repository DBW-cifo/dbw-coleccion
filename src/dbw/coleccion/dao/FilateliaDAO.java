package dbw.filatelias.dao; 

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import dbw.filatelias.entity.Filatelia; 

@Repository
public class FilateliaDAO implements IFilateliaDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Filatelia> getFilatelia() {
	Session miSesion=sessionFactory.getCurrentSession();
	
		List<Filatelia> filatelias=miSesion.createQuery("from Filatelia",Filatelia.class).list();
		return filatelias; 
	}
	
	@Override
	public void save(Filatelia filatelia) {
		Session miSesion=sessionFactory.getCurrentSession(); 
		miSesion.saveOrUpdate(filatelia);
	}

	@Override
	public Filatelia getFilatelia(int idfilatelia) {
		Session miSesion=sessionFactory.getCurrentSession();
		return miSesion.get(Filatelia.class,idfilatelia);
	}
	
	@Override
	public void delete(Filatelia filatelia) {
		Session miSesion=sessionFactory.getCurrentSession();
		miSesion.delete(filatelia);
	}
}
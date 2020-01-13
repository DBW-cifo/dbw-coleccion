package dbw.coleccion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dbw.coleccion.entity.Coleccion;
import dbw.coleccion.dao.IColeccionDAO;

@Service
public class ColeccionService implements IColeccionService { 
@Autowired
private IColeccionDAO ColeccionDAO;

@Override
@Transactional
public List<Coleccion> getColeccion() {
	return ColeccionDAO.getColeccion();
}

@Override
@Transactional
	public void save(Coleccion euro) {
		ColeccionDAO.save(euro);
	}

@Override
@Transactional
public Coleccion getColeccion(int idmoneda) {		
	return ColeccionDAO.getColeccion(idmoneda);
}

 @Override
 @Transactional
 public void delete(Coleccion euro) {
 ColeccionDAO.delete(euro);
 }
}
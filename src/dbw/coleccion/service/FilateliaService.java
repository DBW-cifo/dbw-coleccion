package dbw.filatelias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dbw.filatelias.entity.Filatelia;
import dbw.filatelias.dao.IFilateliaDAO;

@Service
public class FilateliaService implements IFilateliaService { 
@Autowired
private IFilateliaDAO FilateliaDAO;

@Override
@Transactional
public List<Filatelia> getFilatelia() {
	return FilateliaDAO.getFilatelia();
}

@Override
@Transactional
	public void save(Filatelia filatelia) {
		FilateliaDAO.save(filatelia);
	}

@Override
@Transactional
public Filatelia getFilatelia(int idfilatelia) {		
	return FilateliaDAO.getFilatelia(idfilatelia);
}

 @Override
 @Transactional
 public void delete(Filatelia filatelia) {
 FilateliaDAO.delete(filatelia);
}
}
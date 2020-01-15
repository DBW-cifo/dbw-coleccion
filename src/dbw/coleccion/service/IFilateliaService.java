package dbw.filatelias.service; 

import java.util.List;

import dbw.filatelias.entity.Filatelia;

public interface IFilateliaService {
      List<Filatelia> getFilatelia();
      void save(Filatelia filatelia);
      Filatelia getFilatelia(int idfilatelia);	
  	  void delete(Filatelia idfilatelia);
}
package dbw.filatelias.dao;

import java.util.List;

import dbw.filtelias.entity.Filatelia;

public interface IFilateliaDAO {
      List<Filatelia> getFilatelia();
      void save(Filatelia euro);
      Filatelia getFilatelia(int idfilatelia);
  	  void delete(Filatelia filatelia);
}
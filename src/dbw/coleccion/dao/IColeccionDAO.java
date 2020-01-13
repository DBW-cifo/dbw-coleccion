package dbw.coleccion.dao;

import java.util.List;

import dbw.coleccion.entity.Coleccion;

public interface IColeccionDAO {
      List<Coleccion> getColeccion();
      void save(Coleccion euro);
      Coleccion getColeccion(int idmoneda);
  	  void delete(Coleccion euro);
}
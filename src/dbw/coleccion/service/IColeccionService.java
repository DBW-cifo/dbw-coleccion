package dbw.coleccion.service; 

import java.util.List;

import dbw.coleccion.entity.Coleccion;

public interface IColeccionService {
      List<Coleccion> getColeccion();
      void save(Coleccion euro);
      Coleccion getColeccion(int idmoneda);	
  	  void delete(Coleccion idmoneda);
}
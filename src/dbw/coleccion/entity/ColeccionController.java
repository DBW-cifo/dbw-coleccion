package dbw.coleccion.entity; 

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dbw.coleccion.entity.Coleccion;
import dbw.coleccion.service.IColeccionService;

@Controller 
@RequestMapping("/euro") 
public class ColeccionController {
	
@Autowired
private IColeccionService ColeccionService; 

	@RequestMapping("/lista")
		public String lista(Model modelo) {
		List<Coleccion> euro=ColeccionService.getColeccion();
		modelo.addAttribute("euros", euro); 
		return "lista-euros";
    }
	
	@GetMapping("/addeuro")
	public String addColeccion(Model modelo) {
	Coleccion euro = new Coleccion(); 
	modelo.addAttribute("euro", euro); 
	return "form-euro";
	}
	
	@GetMapping("/updateeuro")
	public String updateColeccion(
	@RequestParam("idmoneda") int idmoneda, Model modelo) {		
	Coleccion euro=ColeccionService.getColeccion(idmoneda);
	modelo.addAttribute("euro", euro);
	return "form-euro";
	}
	
	
	@PostMapping("/saveeuro")
	public String saveColeccion
	(@ModelAttribute("euro") Coleccion euro) {
	ColeccionService.save(euro); 
	return "redirect:/euro/lista";
	}
	
	
	@GetMapping("/deleteeuro")
	public String deleteColeccion(
	@RequestParam("idmoneda") int idmoneda) {
	Coleccion euro = ColeccionService.getColeccion(idmoneda);
	ColeccionService.delete(euro);
	return "redirect:/euro/lista";
	}

}
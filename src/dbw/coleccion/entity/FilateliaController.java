package dbw.filatelias.entity; 

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dbw.filatelias.entity.Filatelia;
import dbw.filatelias.service.IFilateliaService;

@Controller 
@RequestMapping("/filatelia") 
public class FilateliaController {
	
@Autowired
private IFilateliaService FilateliaService; 

	@RequestMapping("/lista")
	public String lista(Model modelo) {
	System.out.println("Todo bien. "); 
	List<Filatelia> filatelia=FilateliaService.getFilatelia();	
	modelo.addAttribute("filatelias", filatelia); 
	return "lista-filatelias";
    }
	
	@GetMapping("/addfilatelia")
	public String addFilatelia(Model modelo) {
	Filatelia filatelia = new Filatelia();
	modelo.addAttribute("filatelia", filatelia); 
	return "form-filatelia";
	}
	
	@GetMapping("/updatefilatelia")
	public String updateFilatelia(
	@RequestParam("idfilatelia") int idfilatelia, Model modelo) {		
	Filatelia filatelia=FilateliaService.getFilatelia(idfilatelia);
	modelo.addAttribute("filatelia", filatelia);
	return "form-filatelia";
	}
	
	
	@PostMapping("/savefilatelia")
	public String saveFilatelia
	(@ModelAttribute("filatelia") Filatelia filatelia) {
	FilateliaService.save(filatelia); 
	return "redirect:/filatelia/lista";
	}
	
	
	@GetMapping("/deletefilatelia")
	public String deleteFilatelia(
	@RequestParam("idfilatelia") int idfilatelia) {
	Filatelia filatelia = FilateliaService.getFilatelia(idfilatelia);
	FilateliaService.delete(filatelia);
	return "redirect:/filatelia/lista";
	}

}
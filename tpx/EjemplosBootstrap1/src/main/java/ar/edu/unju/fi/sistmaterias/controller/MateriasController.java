package ar.edu.unju.fi.sistmaterias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.sistmaterias.model.Carrera;
import ar.edu.unju.fi.sistmaterias.model.Materia;

@Controller
public class MateriasController {
	@Autowired
	private List<Materia> materias;
	
	@GetMapping("/materias")
	public String getMateriasPage(Model model) {
		if(materias.size()==1 && materias.get(0).getNombre()==null) {
			
			Materia unaMateria = new Materia(1, "Programación Visual", new Carrera(1, "APU 2008"));
			Materia otraMateria = new Materia(2, "Programación Orientada a Objetos", new Carrera(1, "APU 2008"));
			materias.add(unaMateria);
			materias.add(otraMateria);
		}
		
		model.addAttribute("materias", materias);
		return "materias";
	}	
}



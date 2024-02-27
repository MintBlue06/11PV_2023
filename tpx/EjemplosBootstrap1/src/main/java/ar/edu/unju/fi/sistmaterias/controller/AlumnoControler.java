package ar.edu.unju.fi.sistmaterias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.sistmaterias.model.Alumno;
import jakarta.validation.Valid;

@Controller
public class AlumnoControler {
	@Autowired
	private Alumno alumno;
	@Autowired
	private List<Alumno> alumnos;
	
	@GetMapping("/listalumnos")
	public ModelAndView getAlumnosPage() {
		ModelAndView modelAndView = new ModelAndView("alumnos");
		/*alumno.setApellido("Vega");
		alumno.setNombres("Ariel Alejandro");
		alumno.setDni(11111);
		
		Calendar calendar = new GregorianCalendar();
		calendar.set(1979, 5, 11);
		alumno.setFechaNacimiento(calendar.getTime());*/
		
		modelAndView.addObject("alumnoForm", alumno);
		return modelAndView;
	}
	
	@PostMapping("/saveForm")
	public String saveAlumnoForm(@Valid @ModelAttribute("alumnoForm")  Alumno alumnoCapturado, BindingResult result, Model model) {
		String destino="";
		if(result.hasErrors()) {
			System.out.println(result.getErrorCount());
			System.out.println(result.getObjectName());
			for(ObjectError e: result.getAllErrors()) {
				String fieldError= ((FieldError)e).getField();
				System.out.println(fieldError);
				System.out.println(e.getDefaultMessage());
				
			}
			model.addAttribute("alumnoForm",alumnoCapturado);
			destino="alumnos";
		}else {
			if(alumnos.size()==1 && alumnos.get(0).getDni()==null) {
				alumnos.set(0, alumnoCapturado);
			}else {
				alumnos.add(alumnoCapturado);
			}
			System.out.println(alumnos.size());
			for(Alumno a:alumnos) {
				System.out.println(a.toString());
			}
			destino="redirect:/listalumnos";
			
		}
		
		return destino;
	}
	
	
}

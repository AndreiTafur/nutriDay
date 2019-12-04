package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.model.Persona;
import com.project.repository.IpersonRepo;

@CrossOrigin()
@Controller
public class DemoController {
	
	@Autowired
	private IpersonRepo repo ;

	  @GetMapping("/greeting")
	    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	      Persona p = new Persona();
	      p.setIdpersona(1);
	      p.setNombre("andre");
	      repo.save(p);
	      
		  model.addAttribute("name", name);
	        return "greeting";
	    }

}

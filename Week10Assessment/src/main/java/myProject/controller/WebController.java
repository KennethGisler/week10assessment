package myProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import myProject.beans.Units;
import myProject.repository.ContactRepository;

/**
 * Kenneth Gisler - kgisler@dmacc.edu
 * CIS171 22149
 * Nov 1, 2022
 */

@Controller
public class WebController {
	
	@Autowired //communicates with the repository
	ContactRepository repo;


	@GetMapping("/viewAll")
	public String viewAllContacts(Model model) { //let's us see our units
		if(repo.findAll().isEmpty()) {
			return addNewUnits(model);
		}else {
			model.addAttribute("units",repo.findAll());
			int total = 0;
			for(Units units : repo.findAll()) {
				total += units.getCost();
			}
			System.out.println(total);
			return "results";
		}
	}

	@GetMapping("/inputUnit")
	public String addNewUnits(Model model) { //adds a new unit to the database
		Units u = new Units();
		model.addAttribute("newUnit",u);
		return "input";
	}
	
	@PostMapping("/inputUnit")
	public String addNewUnits(@ModelAttribute Units u,Model model) { 
		
		System.out.println(u.toString());

		repo.save(u);
		return viewAllContacts(model);
		
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Units c = repo.findById(id).orElse(null);
		repo.delete(c);
		return viewAllContacts(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateContact(@PathVariable("id") long id, Model model) {
		Units c = repo.findById(id).orElse(null);
		model.addAttribute("newUnit", c);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseContact(Units c, Model model) {
		repo.save(c);
		return viewAllContacts(model);
	}

}

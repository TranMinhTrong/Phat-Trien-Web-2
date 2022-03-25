package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.form.Personform;
import com.model.Person;

public class MainController {
	private static List<Person> persons = new ArrayList<Person>();

	static {
		persons.add(new Person("Bill", "Gates"));
		persons.add(new Person("Steve", "Jobs"));
	}

	// Được tiêm vào (inject) từ application.properties.
	@Value("${welcome.message}")
	private String message;

	@Value("${error.message}")
	private String errorMessage;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {

		model.addAttribute("message", message);

		return "index";
	}

	@RequestMapping(value = { "/persionlist" }, method = RequestMethod.GET)
	public String personList(Model model) {

		model.addAttribute("persons", persons);

		return "persionlist";
	}

	@RequestMapping(value = { "/addPersion" }, method = RequestMethod.GET)
	public String showAddPersonPage(Model model) {

		Personform personForm = new Personform();
		model.addAttribute("personForm", personForm);

		return "addPerson";
	}

	@RequestMapping(value = { "/addPerison" }, method = RequestMethod.POST)
	public String savePerson(Model model, //
			@ModelAttribute("personForm") Personform personForm) {

		String firstName = personForm.getFirstName();
		String lastName = personForm.getLastName();

		if (firstName != null && firstName.length() > 0 //
				&& lastName != null && lastName.length() > 0) {
			Person newPerson = new Person(firstName, lastName);
			persons.add(newPerson);

			return "redirect:/persionlist";
		}

		model.addAttribute("errorMessage", errorMessage);
		return "addPerson";
	}
}

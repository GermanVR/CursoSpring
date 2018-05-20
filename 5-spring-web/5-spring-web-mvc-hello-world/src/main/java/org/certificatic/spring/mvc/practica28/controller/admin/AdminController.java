package org.certificatic.spring.mvc.practica28.controller.admin;

import org.certificatic.spring.mvc.practica28.rootbeans.BeanComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// Definir controllr
@Controller
// Anotar request mapping "/admin"
@RequestMapping(value = "/admin")
class AdminController {

	// inyectar required false
	@Autowired(required = false)
	private BeanComponent beanComponent;

	// anotar request mapping "/", "" por GET)
	@RequestMapping(value = "/")
	public String showIndexPage(Model model) {

		// enviar mensaje "message" al modelo
		model.addAttribute("message", beanComponent.sayHello("German"));
		return "admin";
	}

}
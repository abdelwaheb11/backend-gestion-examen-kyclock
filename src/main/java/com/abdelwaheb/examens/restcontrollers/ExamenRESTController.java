package com.abdelwaheb.examens.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import com.abdelwaheb.examens.entities.Examen;
import com.abdelwaheb.examens.service.ExamenService;


@RestController
@RequestMapping("/api/examen")
@CrossOrigin
public class ExamenRESTController {
	@Autowired
	ExamenService examenService;

	@GetMapping("/all")
	public List<Examen> getAllExamens() {
		return examenService.getAllExamens();
	}

	

	@GetMapping("/auth")
	Authentication getAuth(Authentication auth)
	{
			return auth;
	}

}

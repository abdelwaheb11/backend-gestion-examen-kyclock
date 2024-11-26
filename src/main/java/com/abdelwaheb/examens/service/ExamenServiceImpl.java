package com.abdelwaheb.examens.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdelwaheb.examens.entities.Examen;
import com.abdelwaheb.examens.repos.ExamenRepository;

@Service
public class ExamenServiceImpl implements ExamenService{

	@Autowired
	ExamenRepository examenRepository;
	
	
	
	
	@Override
	public List<Examen> getAllExamens() {
		
		return examenRepository.findAll();
	}
	
	
	
	

}

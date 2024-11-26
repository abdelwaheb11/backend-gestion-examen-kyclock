package com.abdelwaheb.examens.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.abdelwaheb.examens.entities.Examen;

 
@RepositoryRestResource(path = "rest")
public interface ExamenRepository extends JpaRepository<Examen, Long> {
	



 
}

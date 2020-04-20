package com.uca.capas.controller;

import java.time.LocalDate;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 

@Controller
public class MainController {

	@RequestMapping("/Tarea02")
	public @ResponseBody String tareaCapas2() {
		String nombre = "Nombre: Mario Andres"; 
		String apellido = "Apellido: Munoz Kessler";
		String carnet = "Carnert: 00405016";
		String carrera = "Carrera: Ingeniería Informática"; 
		String year = "Año cursado: cuarto año" ;
		return nombre + "\n" + apellido + "\n" + carnet + "\n" + carrera + "\n" + year + "\n";
	}
	
	@RequestMapping("/param")
	public @ResponseBody String parametro(HttpServletRequest request) {
		Integer dia = Integer.parseInt(request.getParameter("dia"));
		Integer mes = Integer.parseInt(request.getParameter("mes"));
		Integer year = Integer.parseInt(request.getParameter("year"));
		
		LocalDate date = LocalDate.of(year, mes, dia);
		
		return "Dia de la semana es : " + date.getDayOfWeek();
	}
}

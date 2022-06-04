package com.idat.MarioAlejoTapullimaRopa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MarioAlejoTapullimaRopa.model.Ropa;
import com.idat.MarioAlejoTapullimaRopa.service.RopaService;

public class RopaController {
	@Autowired
	private RopaService service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Ropa>listar(){
		return service.listar();
	}

}

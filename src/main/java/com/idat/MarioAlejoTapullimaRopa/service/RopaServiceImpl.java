package com.idat.MarioAlejoTapullimaRopa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MarioAlejoTapullimaRopa.model.Ropa;
import com.idat.MarioAlejoTapullimaRopa.repository.RopaRepository;

@Service
public class RopaServiceImpl implements RopaService {
	@Autowired
	private RopaRepository repository;
	
	@Override
	public List<Ropa> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}

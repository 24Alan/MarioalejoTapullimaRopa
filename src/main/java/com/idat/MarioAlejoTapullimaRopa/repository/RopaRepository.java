package com.idat.MarioAlejoTapullimaRopa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MarioAlejoTapullimaRopa.model.Ropa;

@Repository
public interface RopaRepository  extends JpaRepository<Ropa, Integer>{

}

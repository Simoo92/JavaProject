package com.simos.automobili.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simos.automobili.entities.AutoElettrica;

public interface AutoDAO extends JpaRepository<AutoElettrica, Integer> {

}

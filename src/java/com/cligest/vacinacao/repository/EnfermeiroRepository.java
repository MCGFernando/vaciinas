/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.vacinacao.repository;


import com.cligest.vacinacao.domain.Enfermeiro;
import java.util.List;

/**
 *
 * @author mfernando
 */
public interface EnfermeiroRepository {
    public Integer insert(Enfermeiro e);
    public Integer update(Enfermeiro e);
    public List<Enfermeiro> findAll();
    public Enfermeiro findById(Integer id);
    public void deleteById(Integer id);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.vacinacao.repository;


import com.cligest.vacinacao.domain.Vacina;
import java.util.List;

/**
 *
 * @author mfernando
 */
public interface VacinaRepository {
    public Integer insert(Vacina v);
    public Integer update(Vacina v);
    public List<Vacina> findAll();
    public Vacina findById(Integer id);
    public void deleteById(Integer id);
}

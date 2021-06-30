/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.vacinacao.repository;


import com.cligest.vacinacao.domain.Departamento;
import java.util.List;

/**
 *
 * @author mfernando
 */
public interface DepartamentoRepository {
    public Integer insert(Departamento d);
    public Integer update(Departamento d);
    public List<Departamento> findAll();
    public Departamento findById(Integer id);
    public void deleteById(Integer id);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.vacinacao.repository;


import com.cligest.vacinacao.domain.Dose;
import java.util.List;

/**
 *
 * @author mfernando
 */
public interface DoseRepository {
    public Integer insert(Dose d);
    public Integer update(Dose d);
    public List<Dose> findAll();
    public Dose findById(Integer id);
    public void deleteById(Integer id);
}

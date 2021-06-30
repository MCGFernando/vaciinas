/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.vacinacao.repository;


import com.cligest.vacinacao.domain.Utente;
import java.util.List;

/**
 *
 * @author mfernando
 */
public interface UtenteRepository {
    public Integer insert(Utente u);
    public Integer update(Utente u);
    public List<Utente> findAll();
    public Utente findById(Integer id);
    public void deleteById(Integer id);
}

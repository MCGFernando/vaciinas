/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.vacinacao.repository;

import com.cligest.vacinacao.domain.Vacinacao;
import java.util.List;

/**
 *
 * @author mfernando
 */
public interface VacinacaoRepository {
    public Integer insert(Vacinacao v);
    public Integer update(Vacinacao v);
    public List<Vacinacao> findAll();
    public Vacinacao findById(Integer id);
    public void deleteById(Integer id);
}

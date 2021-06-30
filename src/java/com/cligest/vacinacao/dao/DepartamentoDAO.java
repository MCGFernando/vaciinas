/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.vacinacao.dao;

import com.cligest.vacinacao.domain.Departamento;
import com.cligest.vacinacao.repository.DepartamentoRepository;
import com.cligest.vacinacao.util.PersistenceUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author mfernando
 */
public class DepartamentoDAO implements DepartamentoRepository{

    @Override
    public Integer insert(Departamento d) {
        EntityManager em =  PersistenceUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(d);
        
        em.getTransaction().commit();
        Integer i = d.getId();
        return i;
    }

    @Override
    public Integer update(Departamento d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Departamento> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Departamento findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

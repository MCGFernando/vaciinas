/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.vacinacao.repository;

import com.cligest.vacinacao.domain.Area;
import java.util.List;

/**
 *
 * @author mfernando
 */
public interface AreaRepository {
    public Integer insert(Area a);
    public Integer update(Area a);
    public List<Area> findAll();
    public Area findById(Integer id);
    public void deleteById(Integer id);
}

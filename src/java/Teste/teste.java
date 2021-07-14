/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import com.cligest.vacinacao.dao.DepartamentoDAO;
import com.cligest.vacinacao.domain.Departamento;

/**
 *
 * @author mfernando
 */
public class teste {
    public static void main(String[] args) {
        Departamento d = new Departamento();
        d.setId(null);
        d.setDepartamento("DCOM");
        DepartamentoDAO dao = new DepartamentoDAO();
        Integer i = dao.insert(d);
        System.out.print(i);
    }
}

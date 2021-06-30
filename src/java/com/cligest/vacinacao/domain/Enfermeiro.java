/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.vacinacao.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mfernando
 */
@Entity
@Table(name = "enfermeiro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enfermeiro.findAll", query = "SELECT e FROM Enfermeiro e"),
    @NamedQuery(name = "Enfermeiro.findById", query = "SELECT e FROM Enfermeiro e WHERE e.id = :id"),
    @NamedQuery(name = "Enfermeiro.findByEnfermeiro", query = "SELECT e FROM Enfermeiro e WHERE e.enfermeiro = :enfermeiro"),
    @NamedQuery(name = "Enfermeiro.findByCodigo", query = "SELECT e FROM Enfermeiro e WHERE e.codigo = :codigo")})
public class Enfermeiro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "enfermeiro")
    private String enfermeiro;
    @Column(name = "codigo")
    private String codigo;

    public Enfermeiro() {
    }

    public Enfermeiro(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(String enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enfermeiro)) {
            return false;
        }
        Enfermeiro other = (Enfermeiro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.vacinacao.domain.Enfermeiro[ id=" + id + " ]";
    }
    
}

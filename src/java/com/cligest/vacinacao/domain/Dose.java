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
@Table(name = "dose")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dose.findAll", query = "SELECT d FROM Dose d"),
    @NamedQuery(name = "Dose.findById", query = "SELECT d FROM Dose d WHERE d.id = :id"),
    @NamedQuery(name = "Dose.findByVacinaId", query = "SELECT d FROM Dose d WHERE d.vacinaId = :vacinaId"),
    @NamedQuery(name = "Dose.findByDose", query = "SELECT d FROM Dose d WHERE d.dose = :dose"),
    @NamedQuery(name = "Dose.findByQntdiaspordose", query = "SELECT d FROM Dose d WHERE d.qntdiaspordose = :qntdiaspordose")})
public class Dose implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "vacina_id")
    private int vacinaId;
    @Column(name = "dose")
    private String dose;
    @Column(name = "qntdiaspordose")
    private Integer qntdiaspordose;

    public Dose() {
    }

    public Dose(Integer id) {
        this.id = id;
    }

    public Dose(Integer id, int vacinaId) {
        this.id = id;
        this.vacinaId = vacinaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getVacinaId() {
        return vacinaId;
    }

    public void setVacinaId(int vacinaId) {
        this.vacinaId = vacinaId;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public Integer getQntdiaspordose() {
        return qntdiaspordose;
    }

    public void setQntdiaspordose(Integer qntdiaspordose) {
        this.qntdiaspordose = qntdiaspordose;
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
        if (!(object instanceof Dose)) {
            return false;
        }
        Dose other = (Dose) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.vacinacao.domain.Dose[ id=" + id + " ]";
    }
    
}

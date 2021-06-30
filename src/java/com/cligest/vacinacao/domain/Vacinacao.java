/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.vacinacao.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mfernando
 */
@Entity
@Table(name = "vacinacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vacinacao.findAll", query = "SELECT v FROM Vacinacao v"),
    @NamedQuery(name = "Vacinacao.findById", query = "SELECT v FROM Vacinacao v WHERE v.id = :id"),
    @NamedQuery(name = "Vacinacao.findByAreaId", query = "SELECT v FROM Vacinacao v WHERE v.areaId = :areaId"),
    @NamedQuery(name = "Vacinacao.findByEnfermeiroId", query = "SELECT v FROM Vacinacao v WHERE v.enfermeiroId = :enfermeiroId"),
    @NamedQuery(name = "Vacinacao.findByUtenteId", query = "SELECT v FROM Vacinacao v WHERE v.utenteId = :utenteId"),
    @NamedQuery(name = "Vacinacao.findByVacinaId", query = "SELECT v FROM Vacinacao v WHERE v.vacinaId = :vacinaId"),
    @NamedQuery(name = "Vacinacao.findByDataRegisto", query = "SELECT v FROM Vacinacao v WHERE v.dataRegisto = :dataRegisto"),
    @NamedQuery(name = "Vacinacao.findByDataVacina", query = "SELECT v FROM Vacinacao v WHERE v.dataVacina = :dataVacina")})
public class Vacinacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "area_id")
    private int areaId;
    @Basic(optional = false)
    @Column(name = "enfermeiro_id")
    private int enfermeiroId;
    @Basic(optional = false)
    @Column(name = "utente_id")
    private int utenteId;
    @Basic(optional = false)
    @Column(name = "vacina_id")
    private int vacinaId;
    @Basic(optional = false)
    @Column(name = "dataRegisto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataRegisto;
    @Column(name = "dataVacina")
    @Temporal(TemporalType.DATE)
    private Date dataVacina;

    public Vacinacao() {
    }

    public Vacinacao(Integer id) {
        this.id = id;
    }

    public Vacinacao(Integer id, int areaId, int enfermeiroId, int utenteId, int vacinaId, Date dataRegisto) {
        this.id = id;
        this.areaId = areaId;
        this.enfermeiroId = enfermeiroId;
        this.utenteId = utenteId;
        this.vacinaId = vacinaId;
        this.dataRegisto = dataRegisto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public int getEnfermeiroId() {
        return enfermeiroId;
    }

    public void setEnfermeiroId(int enfermeiroId) {
        this.enfermeiroId = enfermeiroId;
    }

    public int getUtenteId() {
        return utenteId;
    }

    public void setUtenteId(int utenteId) {
        this.utenteId = utenteId;
    }

    public int getVacinaId() {
        return vacinaId;
    }

    public void setVacinaId(int vacinaId) {
        this.vacinaId = vacinaId;
    }

    public Date getDataRegisto() {
        return dataRegisto;
    }

    public void setDataRegisto(Date dataRegisto) {
        this.dataRegisto = dataRegisto;
    }

    public Date getDataVacina() {
        return dataVacina;
    }

    public void setDataVacina(Date dataVacina) {
        this.dataVacina = dataVacina;
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
        if (!(object instanceof Vacinacao)) {
            return false;
        }
        Vacinacao other = (Vacinacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.vacinacao.domain.Vacinacao[ id=" + id + " ]";
    }
    
}

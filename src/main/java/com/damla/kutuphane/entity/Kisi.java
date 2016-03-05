/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.damla.kutuphane.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name = "gnl_Kisi")
public class Kisi implements Serializable {

    private Long id;
    private String ad;
    private String soyad;
    private Date dogumTarihi;
    private String adres;
    private String email;
    private Boolean cinsiyet;

    @Id
    @Column(name = "kisi_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "ad", length = 100, nullable = false)
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Column(name = "soyad", length = 100, nullable = false)
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Column(name = "dogum_tarihi", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Column(name = "adres", length = 400)
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Column(name = "mail", length = 200)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "cinsiyet")
    public Boolean getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Boolean cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}

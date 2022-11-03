/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author MSI
 */
@Entity
@Table(name = "produksi")
@NamedQueries({
    @NamedQuery(name = "Produksi.findAll", query = "SELECT p FROM Produksi p"),
    @NamedQuery(name = "Produksi.findByIdProduksi", query = "SELECT p FROM Produksi p WHERE p.idProduksi = :idProduksi"),
    @NamedQuery(name = "Produksi.findByTanggalProduksi", query = "SELECT p FROM Produksi p WHERE p.tanggalProduksi = :tanggalProduksi")})
public class Produksi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_produksi")
    private String idProduksi;
    @Column(name = "tanggal_produksi")
    @Temporal(TemporalType.DATE)
    private Date tanggalProduksi;
    @JoinColumn(name = "id_produk_pesanan", referencedColumnName = "id_produk_pesanan")
    @ManyToOne(fetch = FetchType.EAGER)
    private DetailPemesanan idProdukPesanan;

    public Produksi() {
    }

    public Produksi(String idProduksi) {
        this.idProduksi = idProduksi;
    }

    public String getIdProduksi() {
        return idProduksi;
    }

    public void setIdProduksi(String idProduksi) {
        this.idProduksi = idProduksi;
    }

    public Date getTanggalProduksi() {
        return tanggalProduksi;
    }

    public void setTanggalProduksi(Date tanggalProduksi) {
        this.tanggalProduksi = tanggalProduksi;
    }

    public DetailPemesanan getIdProdukPesanan() {
        return idProdukPesanan;
    }

    public void setIdProdukPesanan(DetailPemesanan idProdukPesanan) {
        this.idProdukPesanan = idProdukPesanan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduksi != null ? idProduksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produksi)) {
            return false;
        }
        Produksi other = (Produksi) object;
        if ((this.idProduksi == null && other.idProduksi != null) || (this.idProduksi != null && !this.idProduksi.equals(other.idProduksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idProduksi;
    }
    
}

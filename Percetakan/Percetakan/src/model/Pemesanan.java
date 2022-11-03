/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author MSI
 */
@Entity
@Table(name = "pemesanan")
@NamedQueries({
    @NamedQuery(name = "Pemesanan.findAll", query = "SELECT p FROM Pemesanan p"),
    @NamedQuery(name = "Pemesanan.findByIdPemesanan", query = "SELECT p FROM Pemesanan p WHERE p.idPemesanan = :idPemesanan"),
    @NamedQuery(name = "Pemesanan.findByTanggalPemesanan", query = "SELECT p FROM Pemesanan p WHERE p.tanggalPemesanan = :tanggalPemesanan"),
    @NamedQuery(name = "Pemesanan.findByStatusPemesanan", query = "SELECT p FROM Pemesanan p WHERE p.statusPemesanan = :statusPemesanan")})
public class Pemesanan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pemesanan")
    private String idPemesanan;
    @Column(name = "tanggal_pemesanan")
    @Temporal(TemporalType.DATE)
    private Date tanggalPemesanan;
    @Column(name = "status_pemesanan")
    private String statusPemesanan;
    @OneToMany(mappedBy = "idPemesanan", fetch = FetchType.EAGER)
    private List<DetailPemesanan> detailPemesananList;
    @JoinColumn(name = "id_pegawai", referencedColumnName = "id_pegawai")
    @ManyToOne(fetch = FetchType.EAGER)
    private Pegawai idPegawai;
    @JoinColumn(name = "id_customer", referencedColumnName = "id_customer")
    @ManyToOne(fetch = FetchType.EAGER)
    private Customer idCustomer;

    public Pemesanan() {
    }

    public Pemesanan(String idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public String getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(String idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public Date getTanggalPemesanan() {
        return tanggalPemesanan;
    }

    public void setTanggalPemesanan(Date tanggalPemesanan) {
        this.tanggalPemesanan = tanggalPemesanan;
    }

    public String getStatusPemesanan() {
        return statusPemesanan;
    }

    public void setStatusPemesanan(String statusPemesanan) {
        this.statusPemesanan = statusPemesanan;
    }

    public List<DetailPemesanan> getDetailPemesananList() {
        return detailPemesananList;
    }

    public void setDetailPemesananList(List<DetailPemesanan> detailPemesananList) {
        this.detailPemesananList = detailPemesananList;
    }

    public Pegawai getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(Pegawai idPegawai) {
        this.idPegawai = idPegawai;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPemesanan != null ? idPemesanan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pemesanan)) {
            return false;
        }
        Pemesanan other = (Pemesanan) object;
        if ((this.idPemesanan == null && other.idPemesanan != null) || (this.idPemesanan != null && !this.idPemesanan.equals(other.idPemesanan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idPemesanan;
    }
    
}

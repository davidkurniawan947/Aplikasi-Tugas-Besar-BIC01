/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
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

/**
 *
 * @author MSI
 */
@Entity
@Table(name = "detail_pemesanan")
@NamedQueries({
    @NamedQuery(name = "DetailPemesanan.findAll", query = "SELECT d FROM DetailPemesanan d"),
    @NamedQuery(name = "DetailPemesanan.findByIdProdukPesanan", query = "SELECT d FROM DetailPemesanan d WHERE d.idProdukPesanan = :idProdukPesanan"),
    @NamedQuery(name = "DetailPemesanan.findByJumlahPemesananProduk", query = "SELECT d FROM DetailPemesanan d WHERE d.jumlahPemesananProduk = :jumlahPemesananProduk")})
public class DetailPemesanan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_produk_pesanan")
    private String idProdukPesanan;
    @Column(name = "jumlah_pemesanan_produk")
    private Integer jumlahPemesananProduk;
    @JoinColumn(name = "id_pemesanan", referencedColumnName = "id_pemesanan")
    @ManyToOne(fetch = FetchType.EAGER)
    private Pemesanan idPemesanan;
    @OneToMany(mappedBy = "idProdukPesanan", fetch = FetchType.EAGER)
    private List<Produksi> produksiList;

    public DetailPemesanan() {
    }

    public DetailPemesanan(String idProdukPesanan) {
        this.idProdukPesanan = idProdukPesanan;
    }

    public String getIdProdukPesanan() {
        return idProdukPesanan;
    }

    public void setIdProdukPesanan(String idProdukPesanan) {
        this.idProdukPesanan = idProdukPesanan;
    }

    public Integer getJumlahPemesananProduk() {
        return jumlahPemesananProduk;
    }

    public void setJumlahPemesananProduk(Integer jumlahPemesananProduk) {
        this.jumlahPemesananProduk = jumlahPemesananProduk;
    }

    public Pemesanan getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(Pemesanan idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public List<Produksi> getProduksiList() {
        return produksiList;
    }

    public void setProduksiList(List<Produksi> produksiList) {
        this.produksiList = produksiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProdukPesanan != null ? idProdukPesanan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailPemesanan)) {
            return false;
        }
        DetailPemesanan other = (DetailPemesanan) object;
        if ((this.idProdukPesanan == null && other.idProdukPesanan != null) || (this.idProdukPesanan != null && !this.idProdukPesanan.equals(other.idProdukPesanan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idProdukPesanan ;
    }
    
}

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
@Table(name = "pegawai")
@NamedQueries({
    @NamedQuery(name = "Pegawai.findAll", query = "SELECT p FROM Pegawai p"),
    @NamedQuery(name = "Pegawai.findByIdPegawai", query = "SELECT p FROM Pegawai p WHERE p.idPegawai = :idPegawai"),
    @NamedQuery(name = "Pegawai.findByNamaPegawai", query = "SELECT p FROM Pegawai p WHERE p.namaPegawai = :namaPegawai"),
    @NamedQuery(name = "Pegawai.findByTglLahir", query = "SELECT p FROM Pegawai p WHERE p.tglLahir = :tglLahir"),
    @NamedQuery(name = "Pegawai.findByTempatLahir", query = "SELECT p FROM Pegawai p WHERE p.tempatLahir = :tempatLahir"),
    @NamedQuery(name = "Pegawai.findByTelpPegawai", query = "SELECT p FROM Pegawai p WHERE p.telpPegawai = :telpPegawai"),
    @NamedQuery(name = "Pegawai.findByAlamatPegawai", query = "SELECT p FROM Pegawai p WHERE p.alamatPegawai = :alamatPegawai"),
    @NamedQuery(name = "Pegawai.findByTanggalMasuk", query = "SELECT p FROM Pegawai p WHERE p.tanggalMasuk = :tanggalMasuk"),
    @NamedQuery(name = "Pegawai.findByStatusPegawai", query = "SELECT p FROM Pegawai p WHERE p.statusPegawai = :statusPegawai"),
    @NamedQuery(name = "Pegawai.findByAgama", query = "SELECT p FROM Pegawai p WHERE p.agama = :agama"),
    @NamedQuery(name = "Pegawai.findByDataJenisKelamin", query = "SELECT p FROM Pegawai p WHERE p.dataJenisKelamin = :dataJenisKelamin")})
public class Pegawai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pegawai")
    private String idPegawai;
    @Column(name = "nama_pegawai")
    private String namaPegawai;
    @Column(name = "tgl_lahir")
    @Temporal(TemporalType.DATE)
    private Date tglLahir;
    @Column(name = "tempat_lahir")
    private String tempatLahir;
    @Column(name = "telp_pegawai")
    private String telpPegawai;
    @Column(name = "alamat_pegawai")
    private String alamatPegawai;
    @Column(name = "tanggal_masuk")
    @Temporal(TemporalType.DATE)
    private Date tanggalMasuk;
    @Column(name = "status_pegawai")
    private String statusPegawai;
    @Column(name = "agama")
    private String agama;
    @Column(name = "data_jenis_kelamin")
    private String dataJenisKelamin;
    @OneToMany(mappedBy = "idPegawai", fetch = FetchType.EAGER)
    private List<Pemesanan> pemesananList;
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Role roleId;

    public Pegawai() {
    }

    public Pegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTelpPegawai() {
        return telpPegawai;
    }

    public void setTelpPegawai(String telpPegawai) {
        this.telpPegawai = telpPegawai;
    }

    public String getAlamatPegawai() {
        return alamatPegawai;
    }

    public void setAlamatPegawai(String alamatPegawai) {
        this.alamatPegawai = alamatPegawai;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getStatusPegawai() {
        return statusPegawai;
    }

    public void setStatusPegawai(String statusPegawai) {
        this.statusPegawai = statusPegawai;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getDataJenisKelamin() {
        return dataJenisKelamin;
    }

    public void setDataJenisKelamin(String dataJenisKelamin) {
        this.dataJenisKelamin = dataJenisKelamin;
    }

    public List<Pemesanan> getPemesananList() {
        return pemesananList;
    }

    public void setPemesananList(List<Pemesanan> pemesananList) {
        this.pemesananList = pemesananList;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPegawai != null ? idPegawai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pegawai)) {
            return false;
        }
        Pegawai other = (Pegawai) object;
        if ((this.idPegawai == null && other.idPegawai != null) || (this.idPegawai != null && !this.idPegawai.equals(other.idPegawai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idPegawai;
    }
    
}

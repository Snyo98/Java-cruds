/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author sinyo
 */
@Entity
@Table(name = "tb_uts_e2_397", catalog = "db_uts_e2", schema = "")
@NamedQueries({
    @NamedQuery(name = "TbUtsE2397.findAll", query = "SELECT t FROM TbUtsE2397 t"),
    @NamedQuery(name = "TbUtsE2397.findByNik", query = "SELECT t FROM TbUtsE2397 t WHERE t.nik = :nik"),
    @NamedQuery(name = "TbUtsE2397.findByNama", query = "SELECT t FROM TbUtsE2397 t WHERE t.nama = :nama"),
    @NamedQuery(name = "TbUtsE2397.findByJenisKelamin", query = "SELECT t FROM TbUtsE2397 t WHERE t.jenisKelamin = :jenisKelamin"),
    @NamedQuery(name = "TbUtsE2397.findByPekerjaan", query = "SELECT t FROM TbUtsE2397 t WHERE t.pekerjaan = :pekerjaan"),
    @NamedQuery(name = "TbUtsE2397.findByStatus", query = "SELECT t FROM TbUtsE2397 t WHERE t.status = :status"),
    @NamedQuery(name = "TbUtsE2397.findByAnak", query = "SELECT t FROM TbUtsE2397 t WHERE t.anak = :anak")})
public class TbUtsE2397 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nik")
    private Integer nik;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Basic(optional = false)
    @Column(name = "pekerjaan")
    private String pekerjaan;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "anak")
    private String anak;

    public TbUtsE2397() {
    }

    public TbUtsE2397(Integer nik) {
        this.nik = nik;
    }

    public TbUtsE2397(Integer nik, String nama, String jenisKelamin, String pekerjaan, String status, String anak) {
        this.nik = nik;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.pekerjaan = pekerjaan;
        this.status = status;
        this.anak = anak;
    }

    public Integer getNik() {
        return nik;
    }

    public void setNik(Integer nik) {
        Integer oldNik = this.nik;
        this.nik = nik;
        changeSupport.firePropertyChange("nik", oldNik, nik);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        String oldJenisKelamin = this.jenisKelamin;
        this.jenisKelamin = jenisKelamin;
        changeSupport.firePropertyChange("jenisKelamin", oldJenisKelamin, jenisKelamin);
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        String oldPekerjaan = this.pekerjaan;
        this.pekerjaan = pekerjaan;
        changeSupport.firePropertyChange("pekerjaan", oldPekerjaan, pekerjaan);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getAnak() {
        return anak;
    }

    public void setAnak(String anak) {
        String oldAnak = this.anak;
        this.anak = anak;
        changeSupport.firePropertyChange("anak", oldAnak, anak);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nik != null ? nik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUtsE2397)) {
            return false;
        }
        TbUtsE2397 other = (TbUtsE2397) object;
        if ((this.nik == null && other.nik != null) || (this.nik != null && !this.nik.equals(other.nik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uts.java.e2.TbUtsE2397[ nik=" + nik + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

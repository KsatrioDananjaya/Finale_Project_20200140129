/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucp.lagi.ujian;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Danan
 */
@Entity
@Table(name = "ujian")
@NamedQueries({
    @NamedQuery(name = "Ujian.findAll", query = "SELECT u FROM Ujian u"),
    @NamedQuery(name = "Ujian.findById", query = "SELECT u FROM Ujian u WHERE u.id = :id"),
    @NamedQuery(name = "Ujian.findByNik", query = "SELECT u FROM Ujian u WHERE u.nik = :nik"),
    @NamedQuery(name = "Ujian.findByPhoto", query = "SELECT u FROM Ujian u WHERE u.photo = :photo")})
public class Ujian implements Serializable {

    @Lob
    @Column(name = "Photo")
    private byte[] photo;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Lob
    @Column(name = "Name")
    private String name;
    @Column(name = "NIK")
    private Integer nik;
    @Lob
    @Column(name = "Alamat")
    private String alamat;

    public Ujian() {
    }

    public Ujian(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNik() {
        return nik;
    }

    public void setNik(Integer nik) {
        this.nik = nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
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
        if (!(object instanceof Ujian)) {
            return false;
        }
        Ujian other = (Ujian) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucp.lagi.ujian.Ujian[ id=" + id + " ]";
    }

    Date getNIK() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    
}

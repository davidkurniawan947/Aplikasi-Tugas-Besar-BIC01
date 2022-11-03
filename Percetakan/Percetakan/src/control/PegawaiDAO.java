/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import java.util.ArrayList;
import java.util.List;
import model.Pegawai;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PegawaiDAO implements DAOService<Pegawai> {
  private final SessionFactory session = HibernateUtil.getSessionFactory();
  
  public Session openSession() {
    return (Session)this.session.openSession();
  }
  
  public List<Pegawai> getAllData() {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT p FROM Pegawai p ORDER BY p.idPegawai ASC");
      List<Pegawai> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public boolean insertData(Pegawai param) {
    try {
      Session sess = openSession();
      Transaction t = sess.beginTransaction();
      sess.save(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public boolean updateData(Pegawai param) {
    try {
      Session sess = openSession();
      Transaction t = sess.beginTransaction();
      sess.merge(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public boolean deleteData(Pegawai param) {
    try {
      Session sess = openSession();
      param = (Pegawai) sess.createQuery("SELECT p FROM Pegawai p WHERE p.idPegawai = " + param.getIdPegawai()).list().get(0);
      Transaction t = sess.beginTransaction();
      sess.delete(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public Pegawai getData(int pk) {
    try {
      Session sess = openSession();
      Pegawai data = (Pegawai) sess.createQuery("SELECT q FROM Pegawai p WHERE p.idPegawai = " + pk).list().get(0);
      return data;
    } catch (HibernateException e) {
      return new Pegawai();
    } 
  }
}

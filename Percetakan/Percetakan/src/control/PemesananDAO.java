/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import java.util.ArrayList;
import java.util.List;
import model.Pemesanan;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PemesananDAO implements DAOService<Pemesanan> {
  private final SessionFactory session = HibernateUtil.getSessionFactory();
  
  public Session openSession() {
    return (Session)this.session.openSession();
  }
  
  public List<Pemesanan> getAllData() {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT p FROM Pemesanan p ORDER BY p.idPemesanan ASC");
      List<Pemesanan> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public boolean insertData(Pemesanan param) {
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
  
  public boolean updateData(Pemesanan param) {
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
  
  public boolean deleteData(Pemesanan param) {
    try {
      Session sess = openSession();
      param = (Pemesanan) sess.createQuery("SELECT p FROM Pemesanan p WHERE p.idPemesanan = " + param.getIdPemesanan()).list().get(0);
      Transaction t = sess.beginTransaction();
      sess.delete(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public Pemesanan getData(int pk) {
    try {
      Session sess = openSession();
      Pemesanan data = (Pemesanan) sess.createQuery("SELECT p FROM Pemesanan p WHERE p.idPemesanan = " + pk).list().get(0);
      return data;
    } catch (HibernateException e) {
      return new Pemesanan();
    } 
  }
}

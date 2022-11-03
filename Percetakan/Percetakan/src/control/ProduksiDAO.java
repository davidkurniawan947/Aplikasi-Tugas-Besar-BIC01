/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import java.util.ArrayList;
import java.util.List;
import model.Produksi;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProduksiDAO implements DAOService<Produksi> {
  private final SessionFactory session = HibernateUtil.getSessionFactory();
  
  public Session openSession() {
    return (Session)this.session.openSession();
  }
  
  public List<Produksi> getAllData() {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT p FROM Produksi p ORDER BY p.idProduksi ASC");
      List<Produksi> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public boolean insertData(Produksi param) {
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
  
  public boolean updateData(Produksi param) {
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
  
  public boolean deleteData(Produksi param) {
    try {
      Session sess = openSession();
      param = (Produksi) sess.createQuery("SELECT p FROM Produksi p WHERE p.idProduksi = " + param.getIdProduksi()).list().get(0);
      Transaction t = sess.beginTransaction();
      sess.delete(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public Produksi getData(int pk) {
    try {
      Session sess = openSession();
      Produksi data = (Produksi) sess.createQuery("SELECT p FROM Produksi p WHERE p.idProduksi = " + pk).list().get(0);
      return data;
    } catch (HibernateException e) {
      return new Produksi();
    } 
  }
}

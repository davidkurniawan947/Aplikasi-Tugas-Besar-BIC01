/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import java.util.ArrayList;
import java.util.List;
import model.Transaksi;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TransaksiDAO implements DAOService<Transaksi> {
  private final SessionFactory session = HibernateUtil.getSessionFactory();
  
  public Session openSession() {
    return (Session)this.session.openSession();
  }
  
  public List<Transaksi> getAllData() {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT t FROM Transaksi t ORDER BY t.idTransaksi ASC");
      List<Transaksi> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public boolean insertData(Transaksi param) {
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
  
  public boolean updateData(Transaksi param) {
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
  
  public boolean deleteData(Transaksi param) {
    try {
      Session sess = openSession();
      param = (Transaksi) sess.createQuery("SELECT t FROM Transaksi t WHERE t.idTransaksi = " + param.getIdTransaksi()).list().get(0);
      Transaction t = sess.beginTransaction();
      sess.delete(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public Transaksi getData(int pk) {
    try {
      Session sess = openSession();
      Transaksi data = (Transaksi) sess.createQuery("SELECT t FROM Transaksi t WHERE t.idTransaksi = " + pk).list().get(0);
      return data;
    } catch (HibernateException e) {
      return new Transaksi();
    } 
  }
}

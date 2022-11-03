/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.util.ArrayList;
import java.util.List;
import model.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerDAO implements DAOService<Customer> {
  private final SessionFactory session = HibernateUtil.getSessionFactory();
  
  private List<Customer> dataCustomer;
  
  public Session openSession() {
    return (Session)this.session.openSession();
  }
  
  public List<Customer> getAllData() {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT c FROM Customer c ORDER BY c.idCustomer ASC");
      List<Customer> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public boolean insertData(Customer param) {
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
  
  public boolean updateData(Customer param) {
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
  
  public boolean deleteData(Customer param) {
    try {
      Session sess = openSession();
      param = (Customer) sess.createQuery("SELECT c FROM Customer c WHERE c.idCustomer = " + param.getIdCustomer()).list().get(0);
      Transaction t = sess.beginTransaction();
      sess.delete(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public Customer getData(int pk) {
    try {
      Session sess = openSession();
      Customer data = (Customer) sess.createQuery("SELECT c FROM Customer c WHERE c.idCustomer = " + pk).list().get(0);
      return data;
    } catch (HibernateException e) {
      return new Customer();
    } 
  }
}
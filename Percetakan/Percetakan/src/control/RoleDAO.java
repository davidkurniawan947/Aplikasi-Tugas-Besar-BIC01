/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import java.util.ArrayList;
import java.util.List;
import model.Role;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RoleDAO implements DAOService<Role> {
  private final SessionFactory session = HibernateUtil.getSessionFactory();
  
  public Session openSession() {
    return (Session)this.session.openSession();
  }
  
  public List<Role> getAllData() {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT r FROM Role r ORDER BY r.roleId ASC");
      List<Role> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public boolean insertData(Role param) {
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
  
  public boolean updateData(Role param) {
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
  
  public boolean deleteData(Role param) {
    try {
      Session sess = openSession();
      param = (Role) sess.createQuery("SELECT r FROM Role r WHERE r.roleId = " + param.getRoleId()).list().get(0);
      Transaction t = sess.beginTransaction();
      sess.delete(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public Role getData(int pk) {
    try {
      Session sess = openSession();
      Role data = (Role) sess.createQuery("SELECT r FROM Role r WHERE r.roleId = " + pk).list().get(0);
      return data;
    } catch (HibernateException e) {
      return new Role();
    } 
  }
}

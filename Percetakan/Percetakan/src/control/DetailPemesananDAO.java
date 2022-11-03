package control;
import java.util.ArrayList;
import java.util.List;
import model.DetailPemesanan;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DetailPemesananDAO implements DAOService<DetailPemesanan> {
  private final SessionFactory session = HibernateUtil.getSessionFactory();
  
  private List<DetailPemesanan> dataDetailPemesanan;
  
  public Session openSession() {
    return (Session)this.session.openSession();
  }
  
  public List<DetailPemesanan> getAllData() {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT d FROM DetailPemesanan d ORDER BY d.idProdukPesanan ASC");
      List<DetailPemesanan> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public boolean insertData(DetailPemesanan param) {
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
  
  public boolean updateData(DetailPemesanan param) {
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
  
  public boolean deleteData(DetailPemesanan param) {
    try {
      Session sess = openSession();
      param = (DetailPemesanan) sess.createQuery("SELECT d FROM DetailPemesanan d WHERE d.idProdukPesanan = " + param.getIdProdukPesanan()).list().get(0);
      Transaction t = sess.beginTransaction();
      sess.delete(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public DetailPemesanan getData(int pk) {
    try {
      Session sess = openSession();
      DetailPemesanan data = (DetailPemesanan) sess.createQuery("SELECT d FROM DetailPemesanan d WHERE d.idProdukPesanan = " + pk).list().get(0);
      return data;
    } catch (HibernateException e) {
      return new DetailPemesanan();
    } 
  }
}
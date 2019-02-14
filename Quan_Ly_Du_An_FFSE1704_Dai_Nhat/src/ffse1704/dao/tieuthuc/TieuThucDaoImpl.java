/**
 * 
 */
package ffse1704.dao.tieuthuc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ffse1704.entity.tieuthuc.TieuThuc;

/**
 * @author QuangDai
 *
 */

@Repository
public class TieuThucDaoImpl implements TieuThucDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ffse1704.dao.tieuthuc.TieuThucDao#addNew(ffse1704.entity.tieuthuc.TieuThuc)
	 */
	@Override
	public void addNew(TieuThuc tt) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(tt);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ffse1704.dao.tieuthuc.TieuThucDao#update(ffse1704.entity.tieuthuc.TieuThuc)
	 */
	@Override
	public void update(TieuThuc tt) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(tt);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ffse1704.dao.tieuthuc.TieuThucDao#delete(java.lang.String)
	 */
	@Override
	public void delete(int id) {
		Session session = this.sessionFactory.openSession();
		Transaction pd = session.beginTransaction();
		session.update(session.get(TieuThuc.class, id));
		pd.commit();
		session.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ffse1704.dao.tieuthuc.TieuThucDao#getTieuThucByIdTieuThuc(java.lang.String)
	 */
	@Override
	public TieuThuc getTieuThucByIdTieuThuc(String id) {
		Session session = this.sessionFactory.getCurrentSession();
		List<TieuThuc> listTieuThuc = session.createQuery("from TieuThuc where id = '" + id + "'", TieuThuc.class)
				.list();
		TieuThuc TieuThuc = listTieuThuc.get(0);
		return TieuThuc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ffse1704.dao.tieuthuc.TieuThucDao#listTieuThuc(int, int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TieuThuc> listTieuThuc(int iDisplayStart, int iDisplayLength) {
		Session session = this.sessionFactory.getCurrentSession();
		List<TieuThuc> TieuThucList = session.createQuery("from TieuThuc where maCha = '"+"'").setFirstResult(iDisplayStart)
				.setMaxResults(iDisplayLength).list();
		return TieuThucList;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see ffse1704.dao.tieuthuc.TieuThucDao#getRecordsTotal()
	 */
	@Override
	public int getRecordsTotalMaChaNull() {
		Session session = sessionFactory.getCurrentSession();
		int rowCount = session.createQuery("from TieuThuc where maCha = '"+"'").list().size();
		return rowCount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ffse1704.dao.tieuthuc.TieuThucDao#getRecordsByIdTieuThuc(java.lang.String)
	 */
	@Override
	public int getRecordsByIdTieuThuc(String id) {
		Session session = sessionFactory.getCurrentSession();
		int rowCount = session.createQuery("from TieuThuc where id='" + id + "'").list().size();
		return rowCount;
	}

}

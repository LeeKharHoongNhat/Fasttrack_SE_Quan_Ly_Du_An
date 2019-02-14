/**
 * 
 */
package ffse1704.service.tieuthuc;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ffse1704.dao.tieuthuc.TieuThucDao;
import ffse1704.entity.tieuthuc.TieuThuc;

/**
 * @author QuangDai
 *
 */

@Service
public class TieuThucServiceImpl implements TieuThucService {
	@Autowired
	private TieuThucDao tieuThucDao;

	public TieuThucDao getTieuThucDao() {
		return tieuThucDao;
	}

	public void setTieuThucDao(TieuThucDao tieuThucDao) {
		this.tieuThucDao = tieuThucDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ffse1704.dao.tieuthuc.TieuThucDao#addNew(ffse1704.entity.tieuthuc.TieuThuc)
	 */
	@Override
	@Transactional
	public void addNew(TieuThuc tt) {
		this.tieuThucDao.addNew(tt);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ffse1704.dao.tieuthuc.TieuThucDao#update(ffse1704.entity.tieuthuc.TieuThuc)
	 */
	@Override
	@Transactional
	public void update(TieuThuc tt) {
		this.tieuThucDao.update(tt);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ffse1704.dao.tieuthuc.TieuThucDao#delete(java.lang.String)
	 */
	@Override
	@Transactional
	public void delete(int id) {
		this.tieuThucDao.delete(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ffse1704.dao.tieuthuc.TieuThucDao#getTieuThucByIdTieuThuc(java.lang.String)
	 */
	@Override
	@Transactional
	public TieuThuc getTieuThucByIdTieuThuc(String id) {
		return this.tieuThucDao.getTieuThucByIdTieuThuc(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ffse1704.dao.tieuthuc.TieuThucDao#listTieuThuc(int, int)
	 */
	@Override
	@Transactional
	public List<TieuThuc> listTieuThuc(int iDisplayStart, int iDisplayLength) {
		return this.tieuThucDao.listTieuThuc(iDisplayStart, iDisplayLength);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ffse1704.dao.tieuthuc.TieuThucDao#getRecordsTotal()
	 */
	@Override
	@Transactional
	public int getRecordsTotalMaChaNull() {
		return this.tieuThucDao.getRecordsTotalMaChaNull();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ffse1704.dao.tieuthuc.TieuThucDao#getRecordsByIdTieuThuc(java.lang.String)
	 */
	@Override
	@Transactional
	public int getRecordsByIdTieuThuc(String id) {
		return this.tieuThucDao.getRecordsByIdTieuThuc(id);
	}

}

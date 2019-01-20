package ffse1704.service.phongban;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ffse1704.dao.phongban.PhongBanDao;
import ffse1704.entity.phongban.PhongBan;

@Service
public class PhongBanServiceImpl implements PhongBanService {

	@Autowired
	private PhongBanDao phongBanDao;

	public PhongBanDao getPhongBanDao() {
		return phongBanDao;
	}

	public void setPhongBanDao(PhongBanDao phongBanDao) {
		this.phongBanDao = phongBanDao;
	}

	@Override
	@Transactional
	public void addNew(PhongBan pb) {
		this.phongBanDao.addNew(pb);

	}

	@Override
	@Transactional
	public void update(PhongBan pb) {
		this.phongBanDao.update(pb);

	}

	@Override
	@Transactional
	public void delete(String maPhongBan) {
		this.phongBanDao.delete(maPhongBan);

	}

	@Override
	@Transactional
	public PhongBan getPhongBanbyIdPhongBan(String maPhongBan) {
		return this.phongBanDao.getPhongBanbyIdPhongBan(maPhongBan);
	}

	@Override
	@Transactional
	public List<PhongBan> listPhongBan(int iDisPlayStart, int iDinPlayLength) {
		return this.phongBanDao.listPhongBan(iDisPlayStart, iDinPlayLength);
	}

	@Override
	@Transactional
	public int getRecordsTotal() {
		return this.phongBanDao.getRecordsTotal();
	}

	@Override
	@Transactional
	public int getRecordsByIdPhongBan(String maPhongBan) {
		return this.phongBanDao.getRecordsByIdPhongBan(maPhongBan);
	}

}

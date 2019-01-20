package ffse1704.service.phongban;

import java.util.List;

import ffse1704.entity.phongban.PhongBan;

public interface PhongBanService {

	public void addNew(PhongBan pb);

	public void update(PhongBan pb);

	public void delete(String maPhongBan);

	public PhongBan getPhongBanbyIdPhongBan(String maPhongBan);

	public List<PhongBan> listPhongBan(int iDisplayStart, int iDisplayLength);

	public int getRecordsTotal();

	public int getRecordsByIdPhongBan(String maPhongBan);

}
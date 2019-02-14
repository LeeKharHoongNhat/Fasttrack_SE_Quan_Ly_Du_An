/**
 * 
 */
package ffse1704.dao.tieuthuc;

import java.util.List;

import ffse1704.entity.tieuthuc.TieuThuc;

/**
 * @author QuangDai
 *
 */
public interface TieuThucDao {
	
	public void addNew(TieuThuc tt);

	public void update(TieuThuc tt);

	public void delete(int id);

	public TieuThuc getTieuThucByIdTieuThuc(String id);

	public List<TieuThuc> listTieuThuc(int iDisplayStart, int iDisplayLength);

	public int getRecordsTotalMaChaNull();

	public int getRecordsByIdTieuThuc(String id);
}

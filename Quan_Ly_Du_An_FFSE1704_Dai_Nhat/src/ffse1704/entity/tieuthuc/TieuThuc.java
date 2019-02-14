package ffse1704.entity.tieuthuc;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "danh_muc_tieu_thuc")
public class TieuThuc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, length = 11)
	private int id;
	
	@Column(name = "ma_tieu_thuc", nullable = false, length = 11)
	@NotEmpty(message="không được để trống!")
	private String maTieuThuc;
	
	@Column(name = "ten_tieu_thuc", nullable = false, length = 50)
	@NotEmpty(message="không được để trống!")
	private String tenTieuThuc;
	
	@Column(name = "ma_cha", nullable = false, length = 11)
	private String maCha;
	
	public TieuThuc() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaTieuThuc() {
		return maTieuThuc;
	}

	public void setMaTieuThuc(String maTieuThuc) {
		this.maTieuThuc = maTieuThuc;
	}

	public String getTenTieuThuc() {
		return tenTieuThuc;
	}

	public void setTenTieuThuc(String tenTieuThuc) {
		this.tenTieuThuc = tenTieuThuc;
	}

	public String getMaCha() {
		return maCha;
	}

	public void setMaCha(String maCha) {
		this.maCha = maCha;
	}
}

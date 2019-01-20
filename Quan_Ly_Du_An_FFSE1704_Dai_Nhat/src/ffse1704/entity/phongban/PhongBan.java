package ffse1704.entity.phongban;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "phong_ban")
public class PhongBan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ma_phong_ban", unique = true, nullable = false, length = 30)
	@NotEmpty(message="không được để trống!")
	private String maPhongBan;

	@Column(name = "ten_phong_ban", nullable = false, length = 255)
	@NotEmpty(message="không được để trống!")
	private String tenPhongBan;



	public PhongBan() {
	}

	public String getMaPhongBan() {
		return this.maPhongBan;
	}

	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	public String getTenPhongBan() {
		return this.tenPhongBan;
	}

	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}


}
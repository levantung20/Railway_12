package lesson_4;

public class prorgam {

	// Question1:
	Department dep1 = new Department();
	Department department2 = new Department("Phong deV");

	public int  getId() {
		return this.id;
	}

	public String getLoaiDienThoai(String loaiDienThoai) {
		this.LoaiDienThoai = loaiDienThoai;

	}

	public String getHeDieuHanh() {
		return this.getHeDieuHanh();

	}

	public Double getGiaTien() {
		return this.getGiaTien();
	}

	public void setId(int id) {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dep1 == null) ? 0 : dep1.hashCode());
		result = prime * result + ((department2 == null) ? 0 : department2.hashCode());
		result = prime * result + g;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		prorgam other = (prorgam) obj;
		if (dep1 == null) {
			if (other.dep1 != null)
				return false;
		} else if (!dep1.equals(other.dep1))
			return false;
		if (department2 == null) {
			if (other.department2 != null)
				return false;
		} else if (!department2.equals(other.department2))
			return false;
		if (g != other.g)
			return false;
		return true;
	
		
		


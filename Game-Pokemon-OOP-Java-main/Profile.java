
public class Profile {
	public String nama;
	public String gender;
	public Integer umur;
	
	public Profile(String nama, String gender, Integer umur) {
		super();
		this.nama = nama;
		this.gender = gender;
		this.umur = umur;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getUmur() {
		return umur;
	}
	public void setUmur(Integer umur) {
		this.umur = umur;
	}
}

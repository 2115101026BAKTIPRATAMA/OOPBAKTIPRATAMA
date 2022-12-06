package id.ac.undiksha.siak.entities;

public class Dosen {
	private String Nama;
	private String Alamat;
	private String Nip;
	private boolean Jenis_Kelamin;//0 => perempuan 1=>laki-laki
	private String prodi;
	private String jurusan;
	private String fakultas;
	
	public String getNama() {
		return Nama;
	}
	public void setNama(String nama) {
		Nama = nama;
	}
	public String getAlamat() {
		return Alamat;
	}
	public void setAlamat(String alamat) {
		Alamat = alamat;
	}
	public String getNip() {
		return Nip;
	}
	public void setNip(String nip) {
		Nip = nip;
	}
	public boolean isJenis_Kelamin() {
		return Jenis_Kelamin;
	}
	public void setJenis_Kelamin(boolean jenis_Kelamin) {
		Jenis_Kelamin = jenis_Kelamin;
	}
	public String getProdi() {
		return prodi;
	}
	public void setProdi(String prodi) {
		this.prodi = prodi;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getFakultas() {
		return fakultas;
	}
	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}
	
	
}

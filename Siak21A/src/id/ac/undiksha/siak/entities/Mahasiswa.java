package id.ac.undiksha.siak.entities;

public class Mahasiswa {
	private String Nama;
	private String Alamat;
	private String NIM;
	private boolean Jenis_Kelamin;//0 => perempuan 1=>laki-laki
	private String prodi;
	private String jurusan;
	private String fakultas;

	
	public Mahasiswa() {
		 this.setNama("(belum diisi)");
		 this.setAlamat("(belum diisi)");
		 this.setNIM("(belum diisi)");
		// Jenis_Kelamin = "(belum diisi)";
		 this.setProdi("(belum diisi)");
		 this.setJurusan("(belum diisi)");
		 this.setFakultas("(belum diisi)");
	}
	
	public Mahasiswa(String nama, String alamat, String nIM, boolean jenis_Kelamin, String prodi, String jurusan,
			String fakultas) {
		super();
		Nama = nama;
		Alamat = alamat;
		NIM = nIM;
		Jenis_Kelamin = jenis_Kelamin;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public void printlnAllinfo() {
		System.out.println("Nama = " + this.getNama());
		System.out.println("Alamat = " + this.getAlamat());
		System.out.println("NIM = " + this.getNIM());
		System.out.println("Prodi = " + this.getProdi());
		System.out.println("Jurusan= " + this.getJurusan());
		
		System.out.println("Jenis_kelamin = "
		+ (Jenis_Kelamin ? "laki-laki" : "perempuan"));
		
	}
	
	
	
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
	public String getNIM() {
		return NIM;
	}
	public void setNIM(String nIM) {
		NIM = nIM;
	}
	public boolean getJenis_Kelamin() {
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
	
//	public void setNama(String Nama) {
//		this.Nama = Nama;
//	}
//	
//	public String getNama() {
//		return this.Nama;
//	}
	
}

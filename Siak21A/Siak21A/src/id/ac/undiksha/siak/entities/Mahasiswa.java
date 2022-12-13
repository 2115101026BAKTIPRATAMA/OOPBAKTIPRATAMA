package id.ac.undiksha.siak.entities;

public class Mahasiswa extends Manusia{
	private String NIM;
//	private String Nama;
//	private String Alamat;
//	private boolean Jenis_Kelamin;//0 => perempuan 1=>laki-laki
	private String prodi;
	private String jurusan;
	private String fakultas;

	
	public Mahasiswa() {
		super();
		 this.setNIM("(belum diisi)");
		 this.setProdi("(belum diisi)");
		 this.setJurusan("(belum diisi)");
		 this.setFakultas("(belum diisi)");
	}
//	
//	public Mahasiswa(String NIM,String nama, String alamat, boolean jenis_Kelamin, String prodi, String jurusan,
//			String fakultas) {
//		super();
//		this.NIM = NIM;
//		this.Nama = nama;
//		this.Alamat = alamat;
//		this.Jenis_Kelamin = jenis_Kelamin;
//		this.prodi = prodi;
//		this.jurusan = jurusan;
//		this.fakultas = fakultas;
//	}
//
	public void printlnAllinfo() {
		System.out.println("NIM = " + this.getNIM());
		System.out.println("Nama = " + this.getNama());
		System.out.println("Alamat = " + this.getAlamat());
		System.out.println("Jenis_kelamin = "
				+ (this.isJenis_Kelamin() ? "laki-laki" : "perempuan"));		
		System.out.println("Prodi = " + this.getProdi());
		System.out.println("Jurusan= " + this.getJurusan());
		System.out.println("Fakultas= " + this.getFakultas());
		
		
	}
	
	
	public Mahasiswa(String nama, String alamat, boolean jenis_Kelamin) {
		super(nama, alamat, jenis_Kelamin);
		
	}
	
	
	public Mahasiswa(String nama, String alamat, boolean jenis_Kelamin, String nIM, String prodi, String jurusan, String fakultas) {
		
	super(nama, alamat, jenis_Kelamin);
	NIM = nIM;
	this.prodi = prodi;
	this.jurusan = jurusan;
	this.fakultas = fakultas;
}
	

	
	public String getNIM() {
		return NIM;
	}


	public void setNIM(String nIM) {
		NIM = nIM;
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

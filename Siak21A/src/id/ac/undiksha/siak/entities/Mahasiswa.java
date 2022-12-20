package id.ac.undiksha.siak.entities;

import id.ac.undiksha.organisasi.Fakultas;
import id.ac.undiksha.organisasi.Prodi;

public class Mahasiswa extends Manusia{
	private String NIM;
	public Prodi prodi;
	public Fakultas Fakultas;
	
//	private String prodi;
//	private String jurusan;
//	private String fakultas;

	
	public Mahasiswa() {
		super();
		prodi = new Prodi();
		Fakultas = new Fakultas();
		 this.setNIM("(belum diisi)");
		 
		 
//		 this.setProdi("(belum diisi)");
//		 this.setJurusan("(belum diisi)");
//		 this.setFakultas("(belum diisi)");
	}


	

	public void printlnAllinfo() {
		System.out.println("NIM = " + this.getNIM());
		System.out.println("Nama = " + this.getNama());
		System.out.println("Alamat = " + this.getAlamat());
		System.out.println("Jenis_kelamin = "
				+ (this.isJenis_Kelamin() ? "laki-laki" : "perempuan"));	
		
		System.out.println("Kode Prodi = " + this.getProdi().getKodeprodi());
		System.out.println("Nama Prodi = " + this.getProdi().getNamaprodi());
		
		System.out.println("Kode Jurusan = " + this.getProdi().getKodeJurusan());
		System.out.println("Nama Jurusan = " + this.getProdi().getNamaJurusan());
		
		System.out.println("Kode Fakultas = " + this.getFakultas().getKodeFakultas());
		System.out.println("Nama Fakultas = " + this.getFakultas().getNamaFakultas());
		System.out.println("Email Fakultas = " + this.getFakultas().getEmailFakultas());
		

		
		
	}
	
	
	public Mahasiswa(String nama, String alamat, boolean jenis_Kelamin) {
		super(nama, alamat, jenis_Kelamin);
		
	}
	
	
	public Mahasiswa(String nama, String alamat, boolean jenis_Kelamin, String nIM, String kodeprodi, String namaprodi,String KodeJurusan,String NamaJurusan,String NamaFakultas,String KodeFakultas,String EmailFakultas) {
		
	super(nama, alamat, jenis_Kelamin);
	prodi = new Prodi(kodeprodi, namaprodi , KodeJurusan ,NamaJurusan);
	Fakultas = new Fakultas(NamaFakultas,KodeFakultas,EmailFakultas);
	NIM = nIM; 
//	this.prodi = prodi;
//	this.jurusan = jurusan;
//	this.fakultas = fakultas;
}
	
	public Fakultas getFakultas() {
		return Fakultas;
	}


	public void setFakultas(Fakultas fakultas) {
		Fakultas = fakultas;
	}

	
	public Prodi getProdi() {
		return prodi;
	}


	public void setProdi(Prodi prodi) {
		this.prodi = prodi;
	}


	public String getNIM() {
		return NIM;
	}


	public void setNIM(String nIM) {
		NIM = nIM;
	}


//	public String getProdi() {
//		return prodi;
//	}
//
//
//	public void setProdi(String prodi) {
//		this.prodi = prodi;
//	}
//
//
//	public String getJurusan() {
//		return jurusan;
//	}
//
//
//	public void setJurusan(String jurusan) {
//		this.jurusan = jurusan;
//	}
//
//
//	public String getFakultas() {
//		return fakultas;
//	}
//
//
//	public void setFakultas(String fakultas) {
//		this.fakultas = fakultas;
//	}
	
	
	
	
	

	
}

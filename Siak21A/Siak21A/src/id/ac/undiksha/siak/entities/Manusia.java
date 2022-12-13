package id.ac.undiksha.siak.entities;

public abstract class Manusia {
	private String Nama;
	private String Alamat;
	private boolean Jenis_Kelamin;
	
	public Manusia() {
		 this.setNama("(belum diisi)");
		 this.setAlamat("(belum diisi)");

	}
	
	public Manusia(String nama, String alamat, boolean jenis_Kelamin) {
		super();
		
		this.Nama = nama;
		this.Alamat = alamat;
		this.Jenis_Kelamin = jenis_Kelamin;

	}

	public void printlnAllinfo() {
		
		System.out.println("Nama = " + this.getNama());
		System.out.println("Alamat = " + this.getAlamat());
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
	public boolean isJenis_Kelamin() {
		return Jenis_Kelamin;
	}
	public void setJenis_Kelamin(boolean jenis_Kelamin) {
		Jenis_Kelamin = jenis_Kelamin;
	}
	
	

}

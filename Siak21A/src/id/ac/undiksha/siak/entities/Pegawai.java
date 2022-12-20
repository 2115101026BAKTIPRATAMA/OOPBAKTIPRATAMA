package id.ac.undiksha.siak.entities;

public class Pegawai {
	private String IDP;
	private String Nama;
	private String Alamat;
	private boolean Jenis_Kelamin;//0 => perempuan 1=>laki-laki

	public Pegawai() {
		this.setIDP("(belum diisi)");
		 this.setNama("(belum diisi)");
		 this.setAlamat("(belum diisi)");
		 

	}
	
	public Pegawai(String IDP,String nama, String alamat, boolean jenis_Kelamin) {
		super();
		this.IDP = IDP;
		this.Nama = nama;
		this.Alamat = alamat;
		this.Jenis_Kelamin = jenis_Kelamin;

	}

	public void printlnAllinfo() {
		System.out.println("IDP = " + this.getIDP());
		System.out.println("Nama = " + this.getNama());
		System.out.println("Alamat = " + this.getAlamat());
		System.out.println("Jenis_kelamin = "
				+ (Jenis_Kelamin ? "laki-laki" : "perempuan"));		

		
	}
	
	public String getIDP() {
		return IDP;
	}
	public void setIDP(String IDP) {
		this.IDP = IDP;
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

package id.ac.undiksha.organisasi;

public class Prodi implements Jurusan{

	private String kodeprodi;
	private String namaprodi;
	
	
	public Prodi() {
		super();
		 this.setKodeprodi("(belum diisi)");
		 this.setNamaprodi("(belum diisi)");
	 
	}

	
	public Prodi(String kodeprodi, String namaprodi, String KodeJurusan, String NamaJurusan) {
		super();
		 this.kodeprodi = kodeprodi;
		 this.namaprodi = namaprodi;
		 this.KodeJurusan = KodeJurusan;
		 this.NamaJurusan = NamaJurusan;
	 
	}
	
	public void printlnAllinfo() {
		System.out.println("kodeprodi = " + this.getKodeprodi());
		System.out.println("namaprodi = " + this.getNamaprodi());
		System.out.println("kodeJurusan = " + this.getKodeJurusan());
		System.out.println("namaJurusan= " + this.getNamaJurusan());

	}
	
	
	private String NamaJurusan;
	private String KodeJurusan;


	
	public String getKodeprodi() {
		return kodeprodi;
	}
	public void setKodeprodi(String kodeprodi) {
		this.kodeprodi = kodeprodi;
	}
	public String getNamaprodi() {
		return namaprodi;
	}
	public void setNamaprodi(String namaprodi) {
		this.namaprodi = namaprodi;
	}

	public String getNamaJurusan() {
		return this.NamaJurusan;
	}
	
	public void setNamaJurusan(String NamaJurusan) {
		this.NamaJurusan = NamaJurusan;
		
	}

	public String getKodeJurusan() {
		return this.KodeJurusan;
	}

	public void setKodeJurusan(String KodeJurusan) {
		this.KodeJurusan = KodeJurusan;
	}


	
	

	

	
	
}

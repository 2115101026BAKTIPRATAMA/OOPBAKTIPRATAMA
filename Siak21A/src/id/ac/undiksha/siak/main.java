package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Mahasiswa;

public abstract class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
      
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.printlnAllinfo();
		
		Mahasiswa mhs2 = new Mahasiswa("bakti","Singaraja","2115101026",true,"prodi","jurusan","fakultas");
		mhs2.printlnAllinfo();	
//		mhs1.setNama("Nama	: Bakti");
//		mhs1.setNIM("NIM	: 2115101026");
//		mhs1.setAlamat("Alamat	: Singaraja");

		
		
//		System.out.println(mhs1.printlnAllinfo());
		//System.out.println(mhs1.getAlamat());
		

		
		Dosen dsn1 = new Dosen();
//		dsn1.setNama("Nama Dosen : Putra");
		
		
		
//		System.out.println(dsn1.getNama());
		
		
		
	}

	
}

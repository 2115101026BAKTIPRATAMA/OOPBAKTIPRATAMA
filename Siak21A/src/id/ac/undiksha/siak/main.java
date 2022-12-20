package id.ac.undiksha.siak;


import id.ac.undiksha.siak.entities.Mahasiswa;

import id.ac.undiksha.siak.entities.Dosen;

import id.ac.undiksha.siak.entities.Pegawai;


public abstract class main {

	public static void main(String[] args) {

//		Mahasiswa mhs1 = new Mahasiswa();
//		mhs1.printlnAllinfo();
		
		Mahasiswa mhs2 = new Mahasiswa("bakti","Singaraja",true,"2115101026","Kode ILKOM","ILKOM","Kode TI","TI","Kode FTK","FTK","@ftkUndiksha.ac.id");
		mhs2.printlnAllinfo();
		mhs2.getProdi().setKodeprodi("001");
		mhs2.getProdi().getKodeprodi();
		mhs2.getNama();
		mhs2.getProdi().getKodeJurusan();
		mhs2.getProdi().getNamaJurusan();
		mhs2.getFakultas().getKodeFakultas();
		mhs2.getFakultas().getNamaFakultas();
		mhs2.getFakultas().getEmailFakultas();
//		System.out.println();
//		
//		Dosen dsn1= new Dosen("Yudi","Singaraja",true,"123456789","ILKOM","TEKNIK INFORMATIKA","FTK");
//		dsn1.printlnAllinfo();
//		
//		System.out.println();
//		
//		Pegawai pgw1= new Pegawai("001","Putra","Singaraja",false);
//		pgw1.printlnAllinfo();
//		
//		System.out.println();
		
//		Mahasiswa mns1= new Manusia();
//		mns1.setNIM("001");
//		mns1.printlnAllinfo();

//		Manusia mns1 = new Manusia();
//		mns1.printlnAllinfo();
		
		
		
		
	}

	
}

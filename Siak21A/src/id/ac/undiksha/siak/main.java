package id.ac.undiksha.siak;


import id.ac.undiksha.siak.entities.Mahasiswa;

import id.ac.undiksha.siak.entities.Manusia;

import id.ac.undiksha.siak.entities.Dosen;

import id.ac.undiksha.siak.entities.Pegawai;


public abstract class main {

	public static void main(String[] args) {

//		Mahasiswa mhs1 = new Mahasiswa();
//		mhs1.printlnAllinfo();
		
		Mahasiswa mhs2 = new Mahasiswa("bakti","Singaraja",true,"2115101026","ILKOM","TEKNIK INFORMATIKA","FTK");
		mhs2.printlnAllinfo();	

		System.out.println();
		
		Dosen dsn1= new Dosen("Yudi","Singaraja",true,"123456789","ILKOM","TEKNIK INFORMATIKA","FTK");
		dsn1.printlnAllinfo();
		
		System.out.println();
		
		Pegawai pgw1= new Pegawai("001","Putra","Singaraja",false);
		pgw1.printlnAllinfo();
		
		System.out.println();
		
//		Mahasiswa mns1= new Manusia();
//		mns1.setNIM("001");
//		mns1.printlnAllinfo();

//		Manusia mns1 = new Manusia();
//		mns1.printlnAllinfo();
		
		
		
		
	}

	
}

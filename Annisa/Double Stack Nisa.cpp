#include <conio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#define max 1000
#define max1 1000
using namespace std;

//Stack1

struct ma{
	char NM[120];
	char na[120];
};
struct tk{
	int atas;
	ma mhs[max];
}T;
void awal(){
	T.atas=-1;	
}
int fn(){
	if(T.atas==-1)
		return 1;
	else
	{
		return 0;
	}	
}
int fr(){
	if(T.atas==max)
		return 1;
	else
	{
		return 0;
	}
};

void input(char no[20],char nm[20]){
	if(fn()==1){
		T.atas++;
//		T.mhs[T.atas].NM=no;
		strcpy(T.mhs[T.atas].NM,no);
		strcpy(T.mhs[T.atas].na,nm);
	}
	else if(fr()==0){
		T.atas++;
		strcpy(T.mhs[T.atas].NM,no);
		strcpy(T.mhs[T.atas].na,nm);
	}
	//std::cout<<"Data telah masuk";
};
void dl(){
	if(fr()==0){
		std::cout<<"Data telah Terhapus";
		T.atas--;
		std::cout<<"\nTekan enter";
	}
	else{
		std::cout<<"Data Kosong, tidak ada yang dihapus";
	}

};

void ds(){
	if(fr()==0){
		std::cout<<"Data Calon Mahasiswa 1 :\n";		
		for(int i=1;i<=T.atas;i++){
			std::cout<<"\n\t\t"<<T.mhs[i].NM;
			std::cout<<"\n\t\t"<<T.mhs[i].na;
		}
	}
	else{
		std::cout<<"Tumpukan kosong";
	}
};

void cl(){
	T.atas=-1;
	std::cout<<"Tumpukan kosong!";
};


//Stack2
struct ma1{
	char NM1[120];
	char na1[120];
};
struct tk1{
	int atas1;
	ma1 mhs1[max1];
}T1;
void awal1(){
	T1.atas1=-1;	
}
int fn1(){
	if(T1.atas1==-1)
		return 1;
	else
	{
		return 0;
	}	
}
int fr1(){
	if(T1.atas1==max1)
		return 1;
	else
	{
		return 0;
	}
};

void input1(char no1[20],char nm1[20]){
	if(fn1()==1){
		T1.atas1++;
//		T1.mhs1[T1.atas1].NM1=no1;
		strcpy(T1.mhs1[T1.atas1].NM1,no1);
		strcpy(T1.mhs1[T1.atas1].na1,nm1);
	}
	else if(fr1()==0){
		T1.atas1++;
		strcpy(T1.mhs1[T1.atas1].NM1,no1);
		strcpy(T1.mhs1[T1.atas1].na1,nm1);
	}
	//std::cout<<"Data telah masuk";
};
void dl1(){
	if(fr1()==0){
		std::cout<<"Data telah Terhapus";
		T1.atas1--;
		std::cout<<"\nTekan enter";
	}
	else{
		std::cout<<"Data Kosong, tidak ada yang dihapus";
	}

};

void ds1(){
	if(fr1()==0){
		std::cout<<"\n\nData Calon Mahasiswa 2 :\n";		
		for(int i=1;i<=T1.atas1;i++){
			std::cout<<"\n\t\t"<<T1.mhs1[i].NM1;
			std::cout<<"\n\t\t"<<T1.mhs1[i].na1;
		}
	}
	else{
		std::cout<<"Tumpukan kosong";
	}
};

void cl1(){
	T1.atas1=-1;
	std::cout<<"Tumpukan kosong!";
};


int main(){
	int pil;
	char nm[20];
	char nim[20];
	awal;
	do {
		system("cls");
		std::cout<<"Pilih untuk Olah Data Mahasiswa";
		std::cout<<"\n1. Input Data Baru";
		std::cout<<"\n2. Menghapus Data Mahasiswa";
		std::cout<<"\n3. Menampilkan Data Mahasiswa";
		std::cout<<"\n4. Menghapus seluruh data mahasiswa";
		std::cout<<"\n5. Keluar";
		std::cout<<"\n===================================";
		std::cout<<"\nMasukan pilihan = ";
		std::cin>>pil;
		switch(pil){
			case 1:	{
				std::cout<<"\n[1] Mengisi Data 1";
				std::cout<<"\n[2] Mengisi Data 2";
				std::cout<<"\nMasukan pilihan = ";
				std::cin>>pil;
				switch(pil){
					case 1:
				std::cout<<"No.Pendaftaran	= "; cin>>nm;
				std::cout<<"Gelombang       = "; cin>>nim;
				input(nm,nim);
				std::cout<<"Tahun Daftar    = "; cin>>nm;
				std::cout<<"Nomor Urut      = "; cin>>nim;
				input(nm,nim);
				std::cout<<"Nama Lengkap    = "; cin>>nm;
				std::cout<<"Jenis Kelamin	= \n1.Laki-laki\n= 2.Perempuan\nPilih = "; cin>>nim;
//				if(pil==1){
//						nim=="1.Laki-laki";
//					}
//					else if(pil==2){
//						nim=="2.Perempuan";
//					}
//					else{
//						nim==" ";
//					}
				input(nm,nim);
				std::cout<<"Tempat Lahir	= "; cin>>nm;
				std::cout<<"Tanggal Lahir	= "; cin>>nim;
				input(nm,nim);
				std::cout<<"Asal Sekolah	= "; cin>>nm;
				std::cout<<"Jurusan di SMU	= \n1.IPA\n2.IPS\nPilih = "; cin>>nim;
//				if(pil==1){
//						nim=="1.IPA";
//					}
//					else if(pil==2){
//						nim=="2.IPS";
//					}
//					else{
//						nim==" ";
//					}
				
				input(nm,nim);
				std::cout<<"Rata-rata Nem	= "; cin>>nm;
				std::cout<<"Tahun Lulus     = "; cin>>nim;
				input(nm,nim);
				std::cout<<"Alamat\nJalan           = "; cin>>nm;
				std::cout<<"Rt.             = "; cin>>nim;
				input(nm,nim);
				std::cout<<"Rw.             = "; cin>>nm;
				std::cout<<"Telpon\nTelpon          = "; cin>>nim;
				input(nm,nim);
				std::cout<<"Handphone       = "; cin>>nm;
				std::cout<<"Pilih Jurusan Pertama= \n1.DIV-MI\n2.DIII-MI\n3.D-IV-KJP1\nPilih = "; cin>>nim;
//				if(pil==1){
//						nim=="1.DIV-MI";
//					}
//					else if(pil==2){
//						nim=="2.DIII-MI";
//					}
//					else if(pil==3){
//						nim=="3.DIV-KJP1";
//					}
//					else{
//						nim==" ";
//					}
				input(nm,nim);
				break;
				case 2:{
					std::cout<<"No.Pendaftaran	= "; cin>>nm;
				std::cout<<"Gelombang       = "; cin>>nim;
				input1(nm,nim);
				std::cout<<"Tahun Daftar    = "; cin>>nm;
				std::cout<<"Nomor Urut      = "; cin>>nim;
				input1(nm,nim);
				std::cout<<"Nama Lengkap    = "; cin>>nm;
				std::cout<<"Jenis Kelamin	= "; cin>>nim;
				input1(nm,nim);
				std::cout<<"Tempat Lahir	= "; cin>>nm;
				std::cout<<"Tanggal Lahir	= "; cin>>nim;
				input1(nm,nim);
				std::cout<<"Asal Sekolah	= "; cin>>nm;
				std::cout<<"Jurusan di SMU	= "; cin>>nim;
				input1(nm,nim);
				std::cout<<"Rata-rata Nem	= "; cin>>nm;
				std::cout<<"Tahun Lulus     = "; cin>>nim;
				input1(nm,nim);
				std::cout<<"Alamat\nJalan           = "; cin>>nm;
				std::cout<<"Rt.             = "; cin>>nim;
				input1(nm,nim);
				std::cout<<"Rw.             = "; cin>>nm;
				std::cout<<"Telpon\nTelpon          = "; cin>>nim;
				input1(nm,nim);
				std::cout<<"Handphone       = "; cin>>nm;
				std::cout<<"Pilih Jurusan Pertama= "; cin>>nim;
				
				input1(nm,nim);
					break;
				}
				
				
				break;	
				break;
				break;
			}
			}
			
			case 2:	
				std::cout<<"\n[1] Menghapus Data 1";
				std::cout<<"\n[2] Menghapus Data 2";
				std::cout<<"\nMasukan pilihan = ";
				std::cin>>pil;
				switch(pil){
					case 1:	
					dl();
					break;
					case 2:	
					dl1();
					break;
				}
			break;
			
			case 3:	ds();
					ds1();
			break;
			
			case 4: cl();
					cl1();
			break;
			
			case 5:	std::cout<<"Terimakasih"		;
			break;
		}
		getch();
	}
	while(pil!=5);
}





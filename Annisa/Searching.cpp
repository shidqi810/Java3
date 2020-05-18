#include<iostream>
#include<conio.h>
using namespace std;
main() {
	cout<<endl;
	cout<<"  Nama        : Umdatul Qori Halim "<<endl;
	cout<<"  Kelas       : 04 TPLEB Reguler C "<<endl;
	cout<<"  Mata Kuliah : Praktikum Struktur Data"<<endl;
	cout<<endl;

	int Nilai[20];
	int i,N,angka,bilangan;
	cout<<"  Masukan Banyaknya Bilangan = ";cin>>N;

	//membaca elemen array
	for(i=0;i<N;i++){
		cout<<"  Masukan Elemen Ke -"<<i<<" = ";cin>>Nilai[i];
	}

	//mencetak elemen arrray 
	cout<<"  Deretan Bilangan       = ";
	for(i=0;i<N;i++) {
		cout<<Nilai[i]<<" ";
		cout<<endl<<endl;
		cout<<"  Masukan Bilangan Yang Dicari  = ";
		cin>>bilangan;
		cout<<endl;
	}  

	//melakukan pencarian
	i=0;
	do{
		if(Nilai[i]==bilangan)
		angka=Nilai[i];
		i++;
	} while(i<N);
	if(angka==bilangan) {
		cout<<"  Bilangan "<<bilangan<<" Ditemukan";
	}
	else {
		cout<<"  Bilangan "<<bilangan<<" Tidak Ditemukan";
	}
	getch();
}
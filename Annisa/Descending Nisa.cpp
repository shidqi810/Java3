#include<stdio.h>
void sort(int a[], int n, int b[], char c[50], char jk[50]);
void enter();

int main() 
{
	int a[50], b[50], n, i, um;
	char jk[50][50],c[50][50];
	printf(" Urutan Data Pasien\n");
	enter();
	printf(" Masukan Jumlah Data : ");
	scanf("%d",&n);
	for (i = 0; i < n; i++)
	{
		printf(" Nomor Antrian	:");
		scanf("%d",&a[i]);
		printf(" Nama Pasien	:");
		scanf("%s",&c[i]);
		printf(" Jenis Kelamin	:");
		scanf("%s",&jk[i]);
		printf(" Umur		:");
		scanf("%d",&b[i]);
		enter();
	}
	enter();
	printf(" Data Sebelum Disorting: ");
	enter();
	for (i = 0; i < n; i++)
	{
	printf(" Nomor Antrian	: %d",a[i]);
	printf("\n Nama Pasien	: %s",c[i]);
	printf("\n Jenis Kelamin	: %s",jk[i]);
	printf("\n Umur		: %d \n\n",b[i]);
	}
	enter();
	
	sort (a, n, b, c[50], jk[50]);
	enter();enter();
	printf(" Data Setelah Disorting: ");
	enter();
	for(i = 0; i < n; i++){
	printf(" Nomor Antrian	: %d ",a[i]);
	printf("\n Nama Pasien	: %s",c[i]);
	printf("\n Jenis Kelamin	: %s",jk[i]);
	printf("\n Umur		: %d \n\n",b[i]);}
	return 0;
}
void enter()
{
	printf("\n");
}

void sort (int a[], int n, int b[], char c[50], char jk[50])
{
	int i, j, temp;
	for (i = 0; i < n; i ++)
	{
		for(j = 0; j < n - i - 1; j++)
		{
			if(a[j] > a[j+1])
			{
				temp   =  a[j];
				a[j]   =  a[j+1];
				a[j+1] =  temp;	
				
				temp   =  b[j];
				b[j]   =  b[j+1];
				b[j+1] =  temp;	
				
				temp   =  c[j];
				c[j]   =  c[j+1];
				c[j+1] =  temp;
				
				temp   =  jk[j];
				jk[j]   =  jk[j+1];
				jk[j+1] =  temp;	
			}
		}	
		enter();

		for(j = 0; j < n; j++)
		{
		printf("\n Nomor Antrian	: %d ",a[j]);
		printf("\n Nama Pasien	: %s",c[j]);
		printf("\n Jenis Kelamin	: %s",jk[j]);
		printf("\n Umur		: %d\n",b[j]);
		}
	}
	
}

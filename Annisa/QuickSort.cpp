#include “stdio.h”
#include “conio.h”
#include “stdlib.h”

void swap(int &x, int &y);
void quick_sort(int Array[], int &awal, int &akhir);

void main ()
{
	int i, aw, ak, jumdata;
	int data[10] = {4,3,5,6,1,7,2,0,9,8};

	jumdata = sizeof (data) / sizeof (int);

	aw = 0;
	ak = jumdata-1;

	printf(“Pengurutan data dengan Quick Sort\n”);
	printf(“\n Sebelum diurutkan :”);

	for (i=0; i<jumdata;i++)
	printf(“%5d”, data[i]);

	quick_sort(data,aw,ak);

	printf(“\n Sesudah diurutkan :”);

	for(i=0;i<jumdata;i++)
	printf(“%5d”,data[i]);
	getch();
	_exit(0);
}

void quick_sort(int Array[], int &awal, int &akhir)
{
	int i,j,mid;

	mid = (awal+akhir)/2;
	i=awal;
	j=akhir;

	while (i<=j)
	{
		while (Array[i] < Array[mid]) i++; while (Array[j] > Array[mid]) j–;
		if(i<=j)
		{
			swap (Array[i], Array[j]);
			i++;
			j–;
		}
	}
	if (awal<j) quick_sort(Array,awal,j);
	if (i < akhir) quick_sort(Array,i,akhir);
}

void swap(int &x, int &y)
{
	int temp;
	temp = x;
	x = y;
	y = temp;
}
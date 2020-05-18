#include<iostream>
using namespace std;

int main()
{   
    int a,k,c,d,g;

    cout<<"Masukkan Banyaknya inputan ";
    cin>>k;

    int b[k];

    cout<<"mengurutkan nilai dari besar ke kecil"<<endl<<endl;
    for(a = 0; a < k; a++)
    {
        cout<<"Masukkan nilai "<<a+1<<" : ";
        cin>>b[a];
    }

    for(a = 0; a < (k-1); a++)
    {

        for(d = (a+1); d < k; d++)
        {
        c = a;
            if(b[c] < b[d])
            {
                c = d;
            }
        g = b[c];
        b[c] = b[a];
        b[a] = g;
        }

    }
    cout<<"\n Data Setelah diurutkan : \n";
    for(a = 0; a < k; a++)
    {
        cout<<b[a]<<" \n";
    }
}
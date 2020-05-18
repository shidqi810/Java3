import java.io.BufferedReader;
import java.io.InputStreamReader;

class HighArray{
    private double[] x;
    private int nElement;

    public HighArray(int size){
	x = new double[size];
	nElement = 0;
    }
    
    public int getnElement(){
        return nElement;
    }
    
    public boolean find(double searchKey){
        int i;
	for(i = 0; i < nElement; i++){
            if(x[i] == searchKey){
                break;
            }
	}
        if(i == nElement){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void insert(double value){
        x[nElement] = value;
        nElement++;
    }

    public boolean delete(double value){
        int i;
        for(i = 0; i < nElement; i++){
            if( x[i] == value){
                for(int j = i; j < nElement; j++) {
                    x[j] = x[j + 1];
                }

                nElement--;
                break;
            }
        }
        if(i == nElement){
            return false;
        }
        else{
            return true;
        }

    }
    public void display(){
        for(int i = 0; i < nElement; i++){
            System.out.print(x[i] + " ");
        }
    }
}


public class HighArrayApp{
    static BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
    
    public static int bufferedReader() {
        int num = 0;
        
        try {
            num = Integer.parseInt(input.readLine());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return num;
    }
    
    public static void main(String[] args){
        int n;
        int i;
        
        System.out.println("--------------------------------------------------");
        System.out.print("Input jumlah array : ");
        n = bufferedReader();
        HighArray arr = new HighArray(n + 1);
        System.out.println("");
        
        System.out.println("--------------------------------------------------");
        for(i = 1; i <= n; i++) {
            System.out.print("Inputkan elemen array ke-" + i + " : ");
            arr.insert(bufferedReader());
        }
        System.out.println("");
        
        System.out.println("--------------------------------------------------");
        arr.display();
        System.out.println("");
        
        System.out.println("--------------------------------------------------");
        System.out.print("Inputkan elemen yang ingin dicari : ");
        int searchKey = bufferedReader();
        if( arr.find(searchKey)){
            System.out.println("Found " + searchKey);
        }
        else{
            System.out.println("Can't find " + searchKey);
        }
        System.out.println("");
        
        System.out.println("--------------------------------------------------");
        System.out.print("Input jumlah elemen yang ingin dihapus : ");
        n = bufferedReader();
        
        for(i = 1; i <= n; i++){
            if(n == 1){
                System.out.print("Inputkan elemen array yang ingin dihapus : ");
            }
            else{
                System.out.print("Inputkan elemen array yang ingin dihapus ke-" + i + " : ");
            }
            arr.delete(bufferedReader());
        }
        System.out.println("");
        
        System.out.println("--------------------------------------------------");
        if(arr.getnElement() == 0){
            System.out.println("Array kosong");
        }
        else{
            arr.display();
        }
        System.out.println("");
        System.out.println("--------------------------------------------------");
    }
}

//1820803038
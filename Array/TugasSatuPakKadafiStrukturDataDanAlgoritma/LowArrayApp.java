import java.io.BufferedReader;
import java.io.InputStreamReader;

class LowArray {
    private double[] x;
    public LowArray(int size){
        x = new double[size];
    }
    
    public void setElement(int index, double value){
        x[index] = value;
    }
    
    public double getElement(int index){
        return x[index];
    }
}
class LowArrayApp {
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
        int nElement = 0;
        int n;
        int i;

        System.out.println("--------------------------------------------------");
        System.out.print("Input jumlah array : ");
        n = bufferedReader();
        LowArray arr = new LowArray(n + 1);
        System.out.println("");
        
        System.out.println("--------------------------------------------------");
        for(i = 0; i < n; i++) {
            System.out.print("Inputkan elemen array ke-" + (i + 1) + " : ");
            arr.setElement(i, bufferedReader());
            nElement++;
        }
        System.out.println("");
        
        System.out.println("--------------------------------------------------");
        for(i = 0; i < nElement; i++){
            System.out.print(arr.getElement(i) + " ");
        }
        System.out.println("");
        
        System.out.println("--------------------------------------------------");
        System.out.print("Inputkan elemen yang ingin dicari : ");
        int searchKey = bufferedReader();
        
        for(i = 0; i < nElement; i++){
            if(arr.getElement(i) == searchKey){
                break;
            }
        }
        if(i == nElement){
            System.out.println("Can't Find " + searchKey);
        }
        else{
            System.out.println("Found " + searchKey);
        }
        System.out.println("");
        
        System.out.println("--------------------------------------------------");
        System.out.print("Input jumlah elemen yang ingin dihapus : ");
        n = bufferedReader();
        int value;
        
        for(i = 0; i < n; i++){
            if(n == 1){
                System.out.print("Inputkan elemen array yang ingin dihapus : ");
            }
            else{
                System.out.print("Inputkan elemen array yang ingin dihapus ke-" + (i + 1) + " : ");
            }
            value = bufferedReader();
            for(int j = 0; j < nElement; j++){
                if(arr.getElement(j) == value){
                    for(int k = j; k < nElement; k++){
                        arr.setElement(k, arr.getElement(k + 1));
                    }
                    
                    nElement--;
                    break;
                }
            }
        }
        System.out.println("");
  
        System.out.println("--------------------------------------------------");
        if(nElement == 0){
            System.out.println("Array kosong");
        }
        else{
            for(i = 0; i < nElement; i++){
                System.out.print(arr.getElement(i) + " ");
            }
        }
    }
}
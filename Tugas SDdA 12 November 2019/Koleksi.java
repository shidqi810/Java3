import java.io.*;
import java.util.*;

public class Koleksi {
    private static int ukuran;
    private static Collection<String> cs;
    private static String stringInput;
    
    public static void main(String[] args) {
        cs = new LinkedList<String>();
        
        System.out.print("Berapa ukuran COLLECTION diinginkan? ");
        ukuran = inputData();
        
        for(int i = 0; i < ukuran; i++) {
            System.out.print("Data ke-" + (i + 1) + " (Masukkan string) : ");
            stringInput = bacaData();
            cs.add(stringInput);
        }
        tulisData();
    }
    
    private static void tulisData() {
        Collections.sort((List<String>) cs);
        
        Iterator<String> it = cs.iterator();
        
        System.out.println("\nDATA TERURUT DALAM COLLECTION : ");
        while(it.hasNext()) {
            System.out.println("Data : " + it.next());
        }
    }
    
    private static int inputData() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String angkaInput = null;
        
        try {
            angkaInput = bfr.readLine();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
        int data = Integer.valueOf(angkaInput).intValue();
        return data;
    }
    
    private static String bacaData() {
        String data = null;
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String stringInput = null;
        try {
            stringInput = bfr.readLine();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
        data = String.valueOf(stringInput);
        return data;
    }
    
}

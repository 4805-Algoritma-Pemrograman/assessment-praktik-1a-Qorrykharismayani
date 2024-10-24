import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("MASUKAN TOTAL JAM LEMBUR: ");
        int jamLembur = scanner.nextInt();
        
        double honorLembur = hitungHonorLembur(jamLembur);
        
        System.out.println("TOTAL JAM LEMBUR: " + jamLembur);
        System.out.println("HONOR LEMBUR: " + honorLembur);
    }
    
    public static double hitungHonorLembur(int jamLembur) {
        double honor;
        if (jamLembur <= 16) {
            honor = jamLembur * 10000;
        } else {
            honor = 16 * 10000 + (jamLembur - 16) * 15000;
        }
        return honor;
    }
}

        

        

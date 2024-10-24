import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalTripBeliau = 0, 
           totalTripMereka = 0, 
           totalTripKita = 0;
        double omsetBeliau = 0, 
           omsetMereka = 0,
           omsetKita = 0;
        final double biayaPerKM = 13000;
        
        while (true) {
            System.out.print("MASUKAN NAMA DRIVER [Beliau/Mereka/Kita]: ");
            String driver = scanner.next();
            
            System.out.print("LAMA TRIP (km): ");
            int lamaTrip = scanner.nextInt();
            
            switch (driver) {
                case "Beliau":
                    totalTripBeliau += lamaTrip;
                    omsetBeliau += lamaTrip * biayaPerKM;
                    break;

                case "Mereka":
                    totalTripMereka += lamaTrip;
                    omsetMereka += lamaTrip * biayaPerKM ;
                    break;

                case "Kita":
                    totalTripKita += lamaTrip;
                    omsetKita += lamaTrip * biayaPerKM;
                    break;

                default:
                    System.out.println("NAMA DRIVER TIDAK TERDATA.");
                    continue;
            }
            
            System.out.print("INPUT LAGI (Y/N)?: ");
            String inputLagi = scanner.next();
            if (inputLagi.equalsIgnoreCase("N")) {
                break;
            }
        }
        
        int totalTrip = totalTripBeliau + totalTripMereka + totalTripKita;
        String driver;
        double omsetTerBesar;
        
        if (omsetBeliau >= omsetMereka && omsetBeliau >= omsetKita) {
            driver = "BELIAU";
            omsetTerBesar = omsetBeliau;

        } else if (omsetMereka >= omsetBeliau && omsetMereka >= omsetKita) {
            driver = "MEREKA";
            omsetTerBesar = omsetMereka;

        } else {
            driver = "KITA";
            omsetTerBesar = omsetKita;
        }
        
        System.out.println("TOTAL DRIVE YANG DILAKUKAN DRIVER = " + totalTrip);
        System.out.println("OMSET TERTINGGI DIPEROLEH DARI " + driver + " dengan total Omet = " + omsetTerBesar);
    }
}

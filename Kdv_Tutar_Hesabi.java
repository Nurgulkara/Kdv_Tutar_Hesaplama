import java.util.Scanner;
public class Kdv_Tutar_Hesabi {
    public static void main(String[] args) {
        Scanner inp=new Scanner (System.in);

       double fiyat, kdvoran=0.18, kdvtutar, tutar;

        System.out.print("Fiyati Giriniz: ");
        fiyat=inp.nextDouble();
        
        kdvtutar= fiyat * kdvoran;
        tutar = fiyat + kdvtutar;

        System.out.println("KDV Orani:" +kdvoran );
        System.out.println("Kdv Tutari:" +kdvtutar);
        System.out.println("Toplam tutar:" +tutar);


    }
}

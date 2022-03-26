import java.util.Scanner;
public class sinifGecme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double mat, fizik, kimya, turkce, resim, ders=0 ,ort, toplam=0;

        System.out.print("Matematik Notunu Girin:");
        mat=input.nextDouble();
        if (mat<=100 && 0<=mat ){
            toplam +=mat;
            ders++;
        }
        System.out.print("Fizik Notunu Girin:");
        fizik=input.nextDouble();
        if (fizik<=100 && 0<=fizik ){
            toplam +=fizik;
            ders++;
        }
        System.out.print("Kimya Notunu Girin:");
        kimya=input.nextDouble();
        if (kimya<=100 && 0<=kimya ){
            toplam +=kimya;
            ders++;
        }
        System.out.print("Türkçe Notunu Girin:");
        turkce=input.nextDouble();
        if (turkce<=100 && 0<=turkce ){
            toplam +=turkce;
            ders++;
        }
        System.out.print("Resim Notunu Girin:");
        resim=input.nextDouble();
        if (resim<=100 && 0<=resim ){
            toplam +=resim;
            ders++;
        }

        ort=toplam/ders;


        if (ort>=55){
            System.out.println("Sınıfı Geçtiniz");
        }
        else {
            System.out.println("Sınıfta Kaldınız");
        }
        System.out.print("Ortalamanız:" + ort);

    }
}

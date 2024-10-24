import java.util.Scanner;
class OrtalamaHesaplama{
    public static void main(String[] args) {

        int turkce, mat, tarih, fizik, kimya, edebiyat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Edebiyat notunuzu giriniz: ");
        edebiyat = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        int Toplam = mat + turkce + tarih + fizik + kimya + edebiyat;
        int ortalama = Toplam / 6 ;
        System.out.print("Ortalamanız:" + ortalama);


        String sonuc = (ortalama>=50) ? "Geçti" : "Kaldı";
        System.out.print("\nSonuc:" + sonuc);


    }
}

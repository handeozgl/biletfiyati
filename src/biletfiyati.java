import java.util.Scanner;
public class biletfiyati {
    public static void main(String[] args) {
        int mesafe, yas, yolculuktipi;

        Scanner input = new Scanner(System.in);
        System.out.println("gideceginiz sehir kac km uzaklikta:");
        mesafe = input.nextInt();
        System.out.println("kac yasindasiniz");
        yas = input.nextInt();
        System.out.println("yolculuk tipi seciniz:  tek yon-> 1 , gidis-donus-> 2");
        yolculuktipi = input.nextInt();

        double normaltutar, yasindirimi, indirimlitutar, yolculukindirimi = 0, toplamtutar;
        if ((yas<=0) || (mesafe<=0) || ((yolculuktipi<=0) &&(yolculuktipi>2))){
            System.out.println("Hatalı Veri Girdiniz !");
        }else {
            if (yas <= 12) {
                normaltutar = mesafe * 0.1;
                yasindirimi = normaltutar * 0.5;
                indirimlitutar = normaltutar - yasindirimi;
                if (yolculuktipi == 2) {
                    yolculukindirimi = indirimlitutar * 0.2;
                    System.out.println("bilet fiyatiniz: " + ((indirimlitutar - yolculukindirimi) * 2) + "lira");
                } else {
                    System.out.println("bilet fiyatiniz: " + (indirimlitutar) + "lira");
                }
            } else if ((yas > 12) && (yas <= 24)) {
                normaltutar = mesafe * 0.1;
                yasindirimi = normaltutar * 0.1;
                indirimlitutar = normaltutar - yasindirimi;
                if (yolculuktipi == 2) {
                    yolculukindirimi = indirimlitutar * 0.2;
                    System.out.println("bilet fiyatiniz: " + ((indirimlitutar - yolculukindirimi) * 2) + "lira");
                } else {
                    System.out.println("bilet fiyatiniz: " + (indirimlitutar) + "lira");
                }
            } else if (yas >= 65) {
                normaltutar = mesafe * 0.1;
                yasindirimi = normaltutar * 0.3;
                indirimlitutar = normaltutar - yasindirimi;
                if (yolculuktipi == 2) {
                    yolculukindirimi = indirimlitutar * 0.2;
                    System.out.println("bilet fiyatiniz: " + ((indirimlitutar - yolculukindirimi) * 2) + "lira");
                } else {
                    System.out.println("bilet fiyatiniz: " + (indirimlitutar) + "lira");
                }
            } else {
                normaltutar = mesafe * 0.1;
                if (yolculuktipi == 2) {
                    yolculukindirimi = normaltutar * 0.2;
                    System.out.println("bilet fiyatiniz: " + ((normaltutar - yolculukindirimi) * 2) + "lira");
                } else {
                    System.out.println("bilet fiyatiniz: " + (normaltutar) + "lira");
                }
            }
        }

    }
}



package hesaplama.makinesi;

import java.util.Scanner;

public class HesaplamaMakinesi {

  
    public static void main(String[] args) {
     Scanner s =new Scanner (System.in);
     double sayı1;
     double sayı2;
     double sonuc=0;
     String islem;
     while(true){
         System.out.println("\nHesap Makinesi");
         System.out.println("isleminizi seciniz:");
         System.out.println("1.toplama");
         System.out.println("2.cikarma");
         System.out.println("3.carpma");
         System.out.println("4.bolme ");
         System.out.println("5.mod alma ");
         System.out.println("6.us alma");
         System.out.println("7.kok alma ");
         System.out.println("8.sinus  hesaplama ");
         System.out.println("9.cosinus hesaplama ");
         System.out.println("10.tanjant hesaplama ");
         System.out.println("11.logaritmik hesaplama ");
         System.out.println("12.dereceyi radyana cevirme ");
         System.out.println("13.radyani dereceye cevirme ");
         System.out.println("14.cikis");
         System.out.println("1-14 arasi secimini yapiniz: ");
         islem= s.nextLine();
         if (islem.equals("14")){
             System.out.println("hoscakalin,hesap makinesi kapatiliyor .");
             break;
         }
         if (!islem.equals("12") && !islem.equals("13")&&!islem.equals("11")&&!islem.equals("10")&&!islem.equals("9")&&!islem.equals("8")&&!islem.equals("7")){
             System.out.println("birinci sayiyi giriniz:");
             sayı1=s.nextDouble();
             System.out.println("ikinci sayiyi giriniz:");
             sayı2=s.nextDouble();
             s.nextLine();
           
         }else {
             System.out.println("bir sayı giriniz:");
             sayı1=s.nextDouble();
             s.nextLine();
             sayı2=0;
         }
         switch(islem){
             case "1":
             sonuc= toplama(sayı1,sayı2);
                 System.out.println("sonuç:"+sonuc);
                 break;
             case "2":
                 sonuc=cikarma(sayı1,sayı2);
                 System.out.println("sonuç:"+sonuc);
                 break;
             case "3":
                 sonuc=carpma(sayı1,sayı2);
                 System.out.println("sonuç:"+sonuc);
                 break;
             case "4":
                 sonuc=bolme(sayı1,sayı2);
                 System.out.println("sonuç:"+sonuc);
                  break;
             case "5":
                 sonuc=modAlma(sayı1,sayı2);
                 System.out.println("sonuç:"+sonuc);
                  break;
             case "6":
                 sonuc=usAlma(sayı1,sayı2);
                 System.out.println("sonuç:"+sonuc);
                  break;
             case "7":
                 sonuc=kokAlma(sayı1);
                 System.out.println("sonuç:"+sonuc);
                  break;
             case "8":
                 sonuc=sinus(sayı1);
                 System.out.println("sonuç:"+sonuc);
                  break;
             case "9":
                
                 sonuc=kosinus(sayı1);
                 System.out.println("sonuç:"+sonuc);
                  break;
             case "10":
                 sonuc=tanjant(sayı1);
                 System.out.println("sonuç:"+sonuc);
                  break;
             case "11":
                 sonuc=log(sayı1);
                 System.out.println("sonuç:"+sonuc);
                  break;
             case "12":
                 sonuc=dereceCevirme(sayı1);
                 System.out.println("sonuç:"+sonuc);
                  break;
             case "13":
                 sonuc=radyanCevirme(sayı1);
                 System.out.println("sonuç:"+sonuc);
                  break;
             default:
                 System.out.println("geçersiz işlem");
                 break;
                 
                 
                 

                 
                 
             
             
         }
         
     }
     
     
    }
    public static double toplama(double sayı1, double sayı2){
        return sayı1+sayı2;
    }
    public static double cikarma(double sayı1, double sayı2){
        return sayı1-sayı2;
    }
    public static double carpma(double sayı1,double sayı2){
        return sayı1*sayı2;
        
    }
    public static double bolme(double sayı1,double sayı2){
        if (sayı2==0){
            System.out.println("bir sayı sıfıra bölünmez.");
        }
        return sayı1/sayı2;
    }
    public static double modAlma(double sayı1,double sayı2){
        return sayı1%sayı2;
    }
    public static double usAlma(double sayı1,double sayı2){
        return Math.pow(sayı1, sayı2);
    }
    public static double kokAlma(double sayı1){
        return Math.sqrt(sayı1);
    }
    public static double sinus(double sayı1){
        
        return Math.sin(Math.toRadians(sayı1));
    }
    public static double kosinus(double sayı1){
        return Math.cos(Math.toRadians(sayı1));
    }
    public static double tanjant(double sayı1){
        return Math.tan(Math.toRadians(sayı1));
    }
    public static double log(double sayı1){
        return Math.log(sayı1);
    }
    public static double dereceCevirme(double sayı1){
        return Math.toRadians(sayı1); 
    }
    public static double radyanCevirme(double sayı1){
        return Math.toDegrees(sayı1);
       
    }
     
    }

    


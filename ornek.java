import java.util.Scanner;
 
public class Odev3Soru1 {
 
	static int sayiGir,adet=0,adet1=0;
 
	
	//Bu bölümde mükemmel sayıların bulunması ve bölen degerlerın toplanması işlemi yapıldı.
	public static boolean mukemmelSayilariListele(int artanSayi){
		 int mukemmelSayiTopla = 0;
	        for(int i=1; i<artanSayi; i++){
	            if(artanSayi % i == 0){
	            	mukemmelSayiTopla+= i;
	            }
	        }
	        //Bölen sayıların toplamı girilen sayının esitliği kontrol edıldı. doğru ise mükemmel sayıdır.
	        if(mukemmelSayiTopla == artanSayi){
	        	adet++;			//Bulunan her mukemmel sayıda ne kadar mukemmel sayı oldugu hesaplandı.
	            return true;
	        } 
	        else{
	            return false;
	        }
	}
	
	//Ödevde belirtilen gibi her iki sayı türü olmayan degerler bulundu ve bölen degerler toplandı.
	public static boolean herİkisiOlmayanSayilariListele(int artanSayi){
		 int olmayanSayiTopla = 0;
	        for(int i=1; i<artanSayi; i++){
	            if(artanSayi % i == 0){
	            	olmayanSayiTopla+= i;
	            }
	        }
	        //Bölen sayıların toplamı girilen sayı degerinden büyük ise bu sonuc true olarak döndürüldü.
	        if(olmayanSayiTopla > artanSayi){ 
	        	adet1++;			//Bulunan sayının adetleri hesaplandı
	            return true;
	        } 
	        else{
	            return false;
	        }
	}
	
	public static void main(String[] args){
		
		Scanner iha=new Scanner(System.in);	
		
		System.out.print("Bir sayı giriniz: ");
		sayiGir=iha.nextInt();
		
		//Bulunan mükemmel sayılar sırasıyla ekrana yazdırıldı
		System.out.print("Mükemmel sayılar: ");
		for(int i=1; i<=sayiGir; i++){
			if(mukemmelSayilariListele(i)){
				System.out.print(i+" ");
			}
		}
		
		//Kaç adet mukemmel sayı bulundugunu ve bulunan değerin yüzdesi ekrana yazdırıldı. 
		double oran=((double)adet)/((double)sayiGir/100);  //Bulunan sayının oranı
		System.out.println("\n"+adet+" adet mükemmel sayı bulundu (oran: % "+oran+")");
		
		//Mükemmel ve yetersiz-eksik sayılar ekrana yazdırıldı.
		System.out.println();
		System.out.print("Ne mükemmel ne de yetersiz-eksik sayılar\n");
		for(int i=1; i<=sayiGir; i++){
			if(herİkisiOlmayanSayilariListele(i)){
				System.out.print(i+" ");
			}
		}
		//Kaç adet sayı bulundugunu ve bulunan sayıların yüzdesi ekrana yazdırıldı.
		double oran1=((double)adet1)/((double)sayiGir/100); //bulunan sayının oranı
		System.out.print("\n"+adet1+" adet sayı bulundu (oran: %"+oran1+")");
		
	}
 
}

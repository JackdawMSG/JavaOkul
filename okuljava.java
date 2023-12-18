import java.util.Scanner;
import java.util.function.IntFunction;
public class okuljava {
  static Scanner scanner = new Scanner(System.in);
  static String ilksayi;
  static String ikincisayi;
  static String islem;

  public static void main(String[] args) {
    
      sayiAl1();
      sayiAl2();
      islem();
      hesap();
      scanner.close();

       
  }
   public static void sayiAl1 (){
          System.err.println("ilk sayıyı giriniz : ");
          ilksayi = scanner.nextLine();
          if (isInteger(ilksayi, 0)){
              System.err.println("İlk sayı : " + ilksayi);
          }
          else {
              sayiAl1();
          }
      }
      public static void sayiAl2(){
        System.err.println("İkinci sayı giriniz : ");
        ikincisayi = scanner.nextLine();
        if (isInteger(ikincisayi, 0)){
            System.err.println("İlk sayıyı : " + ikincisayi);
        }
        else {
            sayiAl2();
        }
     
    }
   public static void islem(){
    System.out.println("Toplam için + 'ya basınız:");
    System.out.println("Çıkarma için - 'Ye basınız:");
    System.out.println("Çarpma için * 'ya basınız:");
    System.out.println("Bölme için / 'ya basınız:");
    System.out.println("Yüzde almak için % 'ya basınız:");
    islem=scanner.nextLine();
    System.out.println("Seçiminiz :"+ islem);
  
    if(islem.equals("+")||islem.equals("-")||islem.equals("*")||islem.equals("/")||islem.equals("%")){}else{
      islem();
    }

  }
   
  
     public static void hesap(){
 if (islem.equals("+")){
      int sonuc = Integer.parseInt(ilksayi) + Integer.parseInt(ikincisayi);
      System.out.println(ilksayi + " + " + ikincisayi + " = " + sonuc);
    }else if (islem.equals("-")){

      int sonuc = Integer.parseInt(ilksayi) - Integer.parseInt(ikincisayi);
      System.out.println(ilksayi + " - " + ikincisayi + " = " + sonuc);
      
    }else if (islem.equals("*")){
      int sonuc = Integer.parseInt(ilksayi) * Integer.parseInt(ikincisayi);
      System.out.println(ilksayi + " * " + ikincisayi + " = " + sonuc);
    }else if (islem.equals("/")){
      int sonuc = Integer.parseInt(ilksayi) / Integer.parseInt(ikincisayi);
      System.out.println(ilksayi + " / " + ikincisayi + " = " + sonuc);
    }
    else if (islem.equals("%")){
      Double sonuc = (Double.parseDouble(ilksayi) + Double.parseDouble(ikincisayi))/100;
      System.out.println(ilksayi + " % " + ikincisayi + " = " + sonuc);
    }
     }
     /*
     public static void hesap(){
      switch (islem) {
  case "+":
    int sonuc = Integer.parseInt(ilksayi) + Integer.parseInt(ikincisayi);
      System.out.println(ilksayi + " + " + ikincisayi + " = " + sonuc);
    break;
  case "-":
    int sonuc = Integer.parseInt(ilksayi) + Integer.parseInt(ikincisayi);
      System.out.println(ilksayi + " - " + ikincisayi + " = " + sonuc);
    break;
  case "*":
    int sonuc = Integer.parseInt(ilksayi) + Integer.parseInt(ikincisayi);
      System.out.println(ilksayi + " * " + ikincisayi + " = " + sonuc);
    break;
  case "/":
     int sonuc = Integer.parseInt(ilksayi) + Integer.parseInt(ikincisayi);
      System.out.println(ilksayi + " / " + ikincisayi + " = " + sonuc);
    break;
}
     }*/
   
 public static boolean isInteger(String str, int index) {
        if (index == str.length()) {
            return true;
        }

        if (!Character.isDigit(str.charAt(index))) {
            return false;
        }

        return isInteger(str, index + 1);
    }

}





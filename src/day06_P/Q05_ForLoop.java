package day06_P;

public class Q05_ForLoop {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {

     //   System.out.println("for ile");
     //   for (int i = 0; i <255 ; i++) {
     //       char c= (char) i;//casting
     //       System.out.println(i + " ->" + c);
//
     //   }
        System.out.println("while ile");
        int i=0;
        while (i<=255){
            char sembol= (char) i;
            System.out.println(i + " ->" + sembol);
            i++;
        }
        System.out.println("do whie ile");
        int a=0;
        do {
            char karakter= (char) a;
            System.out.println(a + " " +karakter);
            a++;

        }while (a<=255);







        }
    }


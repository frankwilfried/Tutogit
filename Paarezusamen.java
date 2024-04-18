package paarezusammen;

public class Paarezusamen {

   // public static boolean est_croissant(int zhal){
       // return zhal<10 ? true:((zhal/10)%10 -zhal/10<0)? est_croissant(zhal/10 )-((zhal/10)-(zhal/10)%10 -(zhal/10)<0 ?

   // }

        public static long Paarezusamen(int zhal) {

            {
                return  (zhal/10 <10)?(zhal/10+zhal%10):
                        (zhal/10+zhal%10)  <10?
                        ( Paarezusamen(zhal/10))+ (zhal/10%10 +(zhal%10)*10):
                                ( Paarezusamen(zhal/10)+(zhal/10%10 +(zhal%10)*100));

            }
        }

        public static void main(String[] args) {
            int z=12345;
            System.out.println(Paarezusamen(z));
        }
    }



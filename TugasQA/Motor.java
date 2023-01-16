package TugasQA;

import java.util.ArrayList;
import java.util.List;

public class Motor {
   int Speed;
   double RegularPrice;
   String Color;
   Motor(int Speed, double RegularPrice, String Color){
       this.Speed=Speed;
       this.RegularPrice=RegularPrice;
       this.Color=Color;
   }

   void Tampil() {
       System.out.println(this.Speed);
       System.out.println(this.RegularPrice);
       System.out.println(this.Color);
   }


   double getSalePrice(){
       return 0;

    }


}

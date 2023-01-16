package TugasQA;

import java.awt.*;

public class Harlay extends Motor {

        int weight = 1000;
       Harlay(int Speed, double RegularPrice, String Color, int weight){
            super(Speed,RegularPrice,Color);
            this.weight=weight;
        }

        @Override
        double getSalePrice() {
            if (weight > 2000) {
                return RegularPrice * 0.1;
            } else {
                return RegularPrice * 0.2;
            }
        }
    }

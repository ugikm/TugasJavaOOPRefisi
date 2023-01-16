package TugasQA;

public class Yamaha extends Motor {
        int cubicalCentimeter ;
        Yamaha(int Speed,double RegularPrice,String Color,int cubicalCentimeter){
            super(Speed,RegularPrice,Color);
            this.cubicalCentimeter=cubicalCentimeter;

        }

        @Override
        double getSalePrice() {
            if (cubicalCentimeter > 250) {
                return cubicalCentimeter * 0.15;

            } else {
                return cubicalCentimeter * 0.1;
            }
        }
}

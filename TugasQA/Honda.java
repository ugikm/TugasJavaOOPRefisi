package TugasQA;

public class Honda extends Motor{
        int Year ;
        int ManufacturerDiscount ;
        Honda(int Speed,double RegularPrice,String Color,int Year,int ManufacturerDiscount){
                super (Speed,RegularPrice,Color);
                this.Year=Year;
                this.ManufacturerDiscount=ManufacturerDiscount;
        }

        @Override
        double getSalePrice() {
            return RegularPrice - ManufacturerDiscount ;
        }
}

package TugasQA;

public class CilsyAutoShop {
    public static void main(String[] args) {
        Yamaha VegaR=new Yamaha(120,7000000,"silver",125);
        Honda Vario=new Honda(125,8500000,"Hitam",2019,200000);
        Motor Bebek=new Motor(125,8000000,"Hitam");
        System.out.println("Motor Bebek :");
        Bebek.Tampil();
        System.out.println("Motor Honda Vario :");
        Vario.Tampil();
        System.out.println("Motor Yamaha VegaR :");
        VegaR.Tampil();


    }


}

/**
 * Created by I328028 on 11/8/2018.
 */
public class Main {

    public static void main(String[] args) {

        /**
         *
         * to access variables from MacLaptops
         * we need object of MacLaptops.
         * This is referred to as encapsulation.
         *
         *
         * Please see: https://www.geeksforgeeks.org/encapsulation-in-java/
         *
         */
//        Laptop macLaptops = new MacLaptops();
//        System.out.println(macLaptops.getName());

        LaptopI lptop = new WindowsLaptopsImpl();
        lptop.getBuild();
        lptop.getMON();
        lptop.getName();

    }

    /**
     * same name different return type
     * doesn't qualify for function overloading
     * @return
     */
//    public void poly(){
//
//    }

    public int poly(){
        return 1;
    }

    public int poly(int a){
        return 0;
    }

    public int poly(int a, int b){
        return 0;
    }

    public int poly(String a, int b){
        return 0;
    }

    public int poly(int a, String b){
        return 0;
    }


}

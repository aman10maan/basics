/**
 * Created by I328028 on 11/8/2018.
 */
public class MacLaptops extends Laptop {

    int osNumber;

    public MacLaptops() {
        System.out.println("MacLaptops");
    }

    @Override
    public int getName() {
        return 1;
    }

    public int getOsNumber() {
        return osNumber;
    }

    public MacLaptops setOsNumber(int osNumber) {
        this.osNumber = osNumber;
        return this;
    }

}

/**
 * Created by I328028 on 11/8/2018.
 */
public class Laptop {

    public Laptop(){
        System.out.println("Laptop");
    }

    int name;
    int build;

    public int getName() {
        return 0;
    }

    public Laptop setName(int name) {
        this.name = name;
        return this;
    }

    public int getBuild() {
        return generateBuild() + 1;
    }

    public Laptop setBuild(int build) {
        this.build = build;
        return this;
    }

    /**
     *
     * This method is not accessible to any
     * outside class. Business case doesn't make
     * sense to expose this function.
     *
     * @return
     */

    private int generateBuild(){
        return 0;
    }
}

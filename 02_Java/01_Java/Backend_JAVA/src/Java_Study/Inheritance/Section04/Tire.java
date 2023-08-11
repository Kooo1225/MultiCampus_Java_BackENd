package Java_Study.Inheritance.Section04;

public class Tire {
    public int maxRotation;
    public int accmulatedRotation;
    public String location;

    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll(){
        ++accmulatedRotation;
        if ( accmulatedRotation < maxRotation ){
            System.out.printf("%s Tire 수명 : %d회\n",location, maxRotation-accmulatedRotation);
            return true;
        }
        else{
            System.out.printf("*** %s Tire Punk ***", location);
            return false;
        }
    }
}

package Java_Study.Inheritance.Section04;

public class HanKookTire extends Tire{

    public HanKookTire(String location, int maxRotation){
        super(location, maxRotation);
    }

    public boolean roll() {
        ++accmulatedRotation;
        if (accmulatedRotation < maxRotation ){
            System.out.printf("%s HankookTire 수명 : %d회\n", location, maxRotation-accmulatedRotation);
            return true;
        }
        else{
            System.out.printf("*** %s HanKookTire Punk ***\n", location);
            return false;
        }
    }
}

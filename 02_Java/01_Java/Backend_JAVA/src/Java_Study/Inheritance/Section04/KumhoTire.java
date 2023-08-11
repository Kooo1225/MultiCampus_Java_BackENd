package Java_Study.Inheritance.Section04;

public class KumhoTire extends Tire{

    public KumhoTire(String location, int maxRotation){
        super(location, maxRotation);
    }

    public boolean roll(){
        ++accmulatedRotation;
        if ( accmulatedRotation < maxRotation ){
            System.out.printf("%s KumhoTire 수명 : %d회\n", location, maxRotation-accmulatedRotation);
            return true;
        }
        else{
            System.out.printf("*** %s KumhoTire Punk ***\n", location);
            return false;
        }
    }
}

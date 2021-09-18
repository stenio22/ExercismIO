package lasagna;

public class Lasanha {

    // TODO: define the 'expectedMinutesInOven()' method
int expectedMinutesInOven() {
    return 40;
}
    
    // TODO: define the 'remainingMinutesInOven()' method
int remainingMinutesInOven(int minutosAtuais) {
    return this.expectedMinutesInOven()-minutosAtuais;
}
    // TODO: define the 'preparationTimeInMinutes()' method
int preparationTimeInMinutes(int camadasLasanha) {
    return 2*camadasLasanha;
}
    // TODO: define the 'totalTimeInMinutes()' method
int totalTimeInMinutes(int camadasLasanha, int mins) {
    return this.preparationTimeInMinutes(camadasLasanha) + mins ;
}
    public static void main(String[] args) {
        Lasanha lasagna = new Lasanha();
        System.out.println(lasagna.totalTimeInMinutes(3,20));
        
    }
}

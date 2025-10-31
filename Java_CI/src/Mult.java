// Klasse kann 2 Zahlen multiplizieren und führt einige Tests mit der Funktion durch

public class Mult {
    public static void main(String[] args) throws Exception {
        System.out.println("Starte Tests: ");


        boolean testspassed = true;
        if(Mult.multiply(2,0) == 0){
            System.out.println("Test 1 Erfolgreich!");
        }
        else{
            System.out.println("Test 1 not passed");
            testspassed = false;
        }

        if(Mult.multiply(3,-2) == -6){
            System.out.println("Test 2 Erfolgreich!");
        }
        else{
            System.out.println("Test 2 not passed");
            testspassed = false;
        }

        if(Mult.multiply(1,4) == 4){
            System.out.println("Test 3 Erfolgreich!");
        }
        else{
            System.out.println("Test 3 not passed");
            testspassed = false;
        }

        if(Mult.multiply(3,5) == 15){
            System.out.println("Test 4 Erfolgreich!");
        }
        else{
            System.out.println("Test 4 not passed");
            testspassed = false;
        }


        if(testspassed){
            System.out.println("Alle Tests bestanden");
        }
        else{
            System.out.println("Tests wurden nicht alle bestanden!");
            System.exit(1);
        }
    }


    public static int multiply(int a, int b){
        return a*b;
    }
}

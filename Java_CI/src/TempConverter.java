public class TempConverter {
    public static void main(String[] args) throws Exception {
        System.out.println("Starte Tests: ");


        boolean testspassed = true;
        if(TempConverter.CelToFar(12) == 53.6){
            System.out.println("Test 1 Erfolgreich!");
        }
        else{
            System.out.println("Test 1 not passed");
            testspassed = false;
        }

        if(TempConverter.CelToFar(-13) == 8.6){
            System.out.println("Test 2 Erfolgreich!");
        }
        else{
            System.out.println("Test 2 not passed");
            testspassed = false;
        }

        if(TempConverter.FarToCel(12) == -11.111){
            System.out.println("Test 3 Erfolgreich!");
        }
        else{
            System.out.println("Test 3 not passed");
            testspassed = false;
        }

        if(TempConverter.FarToCel(-1) == -18.3333){
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

    public static double CelToFar(double temperature){
        return (temperature * 9/5) + 32;
    }

    public static double FarToCel(double temperature){
        return (temperature - 32) * 5/9;
    }
}

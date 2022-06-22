public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;
        for(var i= startingYear; i < targetYear-1; i++) {
            int currentYear = i + 1;
            if(currentYear == 2001) {
                System.out.println((currentYear - startingYear) + " year has passed");
            } 
            else {
            System.out.println((currentYear - startingYear) + " year(s) have passed");
            }

        }
    }
}

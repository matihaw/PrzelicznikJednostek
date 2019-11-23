import java.util.Scanner;





class Main {
    public static void KilometersToMiles(){
        int value = scanning(true);
        if (value==1){
            System.out.println(value + " Kilometer = " + value*0.62 + " Miles");
        }else{
            System.out.println(value + " Kilometers = " + value*0.62 + " Miles");
        }
    }


    public static void MilesToKiloeters(){
        int value = scanning(true);
        if (value==1){
            System.out.println(value + " Mile = " + value*1.6 + " Kilometers");
        }else{
            System.out.println(value + " Miles = " + value*1.6 + " Kilometers");

        }
    }

    public static void LitersToGallons(){
        int value = scanning(true);
        if (value==1){
            System.out.println(value + " Liter = " + value*0.26 + " Gallons");
        } else{
            System.out.println(value +" Liters = "+ value*0.26 + " Gallons");
        }
    }

    public static void GallonsToLitters(){
        int value = scanning(true);
        if (value==1){
            System.out.println(value + " Gallon = " + value *3.78 + " Liters");
        }
        else {
            System.out.println(value +  " Gallons = " + value*3.78 + " Liters" );
        }
    }


    public static void KiloToMile(){
        int value = scanning(true);
        if (value==1){
            System.out.println(value + " Kilometer per hour = " + value*0.62 + " Miles per hour");
        }
        else{
            System.out.println(value + " Kilometers per hour = " + value*0.62 + " Miles per hour");
        }
    }

    public static void MileToKilo(){
        int value = scanning(true);
        if (value==1){
            System.out.println(value + " Mile = "+ value*1.6 + " Kilometers per hour" );
        } else {
            System.out.println(value + "Miles = "+ value*1.6 + " Kilometers per hour");
        }
    }







    public static int scanning(boolean text){
        Scanner scanner = new Scanner(System.in);
        if (text==true){
            System.out.println("Give me a number");
            int scan = scanner.nextInt();
            return scan;
        } else {
            System.out.println("What you want to do?");
            int scan = scanner.nextInt();
            if (scan==8 || scan==7 || scan>9 || scan<=0){
                System.out.println("Bad input!");
                return 0;
            }else{
                return scan;
            }
        }
    }



    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("WELCOME TO MY MENU:");

        boolean loop = true;
        while (loop){

            System.out.println("");
            System.out.println("1-Switch Kilometers to Miles");
            System.out.println("2-Switch Miles to Kilometers");
            System.out.println("3-Switch Liters to Gallons");
            System.out.println("4-Switch Gallons to Liters");
            System.out.println("5-Switching Kilometers per hour to Miles per hour");
            System.out.println("6-Switching Miles per hour to Kilometers per hour");
            System.out.println("9-Exit");



            switch (scanning(false)) {
                case 1:
                    KilometersToMiles();
                    break;
                case 2:
                    MilesToKiloeters();
                    break;
                case 3:
                    LitersToGallons();
                    break;
                case 4:
                    GallonsToLitters();
                    break;
                case 5:
                    KiloToMile();
                    break;
                case 6:
                    MileToKilo();
                    break;
                case 9:
                    loop = false;
                default:
                    break;
            }

        }

    }

}

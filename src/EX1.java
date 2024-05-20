public class EX1 {
    public static void main(String[] args) {
        System.out.println(product(2,5));
        System.out.println(concat("ciao", 3));
        String[] arrayString = {"marco", "andrea", "giuseppe", "paolo", "alessia"};
        String text = "CIAO";

        String[] resultArray = unione(arrayString, text);


        for (int i = 0; i < resultArray.length; i++) {

            System.out.println(resultArray[i]);
        }

    }

    public static int product(int num1, int num2) {


        return num1 + num2;
    }

    public static String concat(String example1, int example2){
        return example1 + example2;
        

}

public static String[] unione(String[] arrayString, String text){
        String[] newArray = new String[6];
        for(int i = 0 ; i < newArray.length ; i++){
            if (i < 2) {

                newArray[i] = arrayString[i];
            } else if (i == 2) {
                newArray[i] = text;
            } else {
                newArray[i] = arrayString[i -1];
            }




        }
                return newArray;

}
}

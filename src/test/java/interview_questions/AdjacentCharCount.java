package interview_questions;

public class AdjacentCharCount {


    public static void  main(String[] args) {

        String str = "seeertubERRRR";
        String[] arr = str.toLowerCase().split("");
        int counter = 1;
        int max = 1;
       // String position1 = arr[0];
        for (int i=1; i<str.length(); i++) {
            if (arr[i].equals(arr[i-1])) {
                counter++;
            }
            else {
                //position1 = arr[i];
                if(counter > max) {
                    max = counter;
                }
                counter = 1;
            }
        }
        System.out.println(max);

    }
}

package interview_questions;

public class FillTheArray {

    public static void main(String[] args) {

        fill();
    }

    public static void fill() {

        int[] firstArr = {10, 30, 50, 23, 45};
        int[] secondArr = {23, 88, 45, 56};

        int[] newArray = new int[firstArr.length];

        for (int i=0; i<secondArr.length; i++) {

            newArray[i] = secondArr[i];
        }

        for (int i=0; i< firstArr.length; i++) {

            int start = firstArr[i];
            int next = newArray[i];
            int total = start+next;
            System.out.println(total);
        }

    }
}

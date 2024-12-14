package interview_questions;

public class Fibonacci {

    public static void main(String[] args) {

        // 0 1 1 2 3 5 8 13

        int total = 5;
        int start = 0;
        int next = 1;
        int last = 0;

        for(int i=0; i<=total; i++) {

            System.out.println(start);
            last = start+next;
            start = next;
            next = last;
        }
    }
}

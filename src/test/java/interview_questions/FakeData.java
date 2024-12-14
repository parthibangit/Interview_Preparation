package interview_questions;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakeData {

    static Faker faker;

    public static void main(String[] args) {

        faker = new Faker(Locale.CANADA);
//        System.out.println(faker.name().firstName());
//        System.out.println(faker.name().lastName());
        System.out.println(faker.phoneNumber().cellPhone());
//        System.out.println(faker.address().zipCode());
//        System.out.println(faker.address().city());
//        System.out.println(faker.address().streetAddress());
//        System.out.println(faker.address().state());
//        System.out.println(faker.company().name());
        //System.out.println(faker.commerce().material());



//        String stateCode = getZipCodeBasedOnState();
//        String zipCode = faker.address().zipCodeByState(stateCode);

        //System.out.println(zipCode);
    }

    public static String getZipCodeBasedOnState() {

        String address = faker.address().fullAddress();
        System.out.println(address);
        String[] arr = address.split(" ");
        String stateCode = null;

        for (int i=0; i< arr.length; i++) {

            if(arr[i].length() == 2) {

                stateCode = arr[i];
            }
        }
        return stateCode;
    }
}

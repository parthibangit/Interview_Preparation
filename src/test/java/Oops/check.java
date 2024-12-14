package Oops;

import java.io.File;

public class check extends Child {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir");
        String finalPath = path+ File.separator+"test"+File.separator+"filetest";
        System.out.println(finalPath);
    }

}

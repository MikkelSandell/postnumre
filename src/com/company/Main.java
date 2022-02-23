package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner indput = new Scanner(System.in);
        fileReader f = new fileReader();
        ArrayList<PostInfo> postInfos;
        postInfos = f.fileReader();


        System.out.println("indsæt postnummer på en by: ");
        int userIndput = 800;
        for (PostInfo postInfo : postInfos) {
            if (postInfo.getPostnymmer() == userIndput) {
                System.out.println("Resultat -> " + postInfo);
                break;
            } else {
                System.out.println("der er ikke en by med dette postnummer");
            }

        }
    }
}

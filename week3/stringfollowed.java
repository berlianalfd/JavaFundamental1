import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author berlianlfd
 * @version 2022-02-18
 */

public class stringfollowed{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================");
        String [] splitLine;
        for (int be=0; be<3; be++){
            splitLine = sc.nextLine().split(" ");
            String s = splitLine[0];
            int Number = Integer.parseInt(splitLine[1]);
            System.out.printf("%-15s%03d\n",s,Number);
        }
        System.out.println("============================");
    }
}

package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
//        for (int i = 0; i < cathetusLength; i++) {
//            String str="";
//            for (int j = 0; j < cathetusLength; j++) {
//                if(cathetusLength-i<=j){
//                    str+="*";
//                }else {
//                    str+=" ";
//                }
//            }
//            System.out.println(str);
//        }
        for (int i = 1; i <= cathetusLength; i++) {
            String str="";
            for (int j = 1; j <= cathetusLength; j++) {
                if(cathetusLength-i<j){
                    str+="*";
                }else {
                    str+=" ";
                }
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
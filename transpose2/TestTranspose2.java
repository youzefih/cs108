//package com.ch.classes;

import java.util.Scanner;

public class TestTranspose2 {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //System.out.println("enter row value");
       int row = sc.nextInt();
      // System.out.println("enter column value");
       int cols = sc.nextInt();

       if ((row == 0) || (cols == 0)) {
           System.out.print("\n\n");
           return;
       } else {
           Transpose2 t = new Transpose2(row, cols);
           System.out.println(t.getRows() + " by " + t.getCols() + " matrix");
           System.out.println("");
          // System.out.println("the given column value is " + t.getCol());
          // System.out.println(t.getIdentificationString());
           t.print2DArray();
           t.print2DArrayTransposed();
       }
   } }
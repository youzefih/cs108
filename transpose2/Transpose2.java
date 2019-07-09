//package com.ch.classes;

import java.util.Scanner;

public class Transpose2 {
   int array[][];
   int row;
   int col;

   public Transpose2(int row, int col) {
       this.row = row;
       this.col = col;
       array = new int[row][col];
       createPatterned2DArray();
   }

   
   public int getRows() {
       return row;
   }

   
   public void setRows(int row) {
       this.row = row;
   }

   
   public int getCols() {
       return col;
   }

   
   public void setCols(int col) {
       this.col = col;
   }

   // Creates the array
   private void createPatterned2DArray() {

       for (int i = 0; i < array.length; ++i) {
           for (int j = 0; j < array[i].length; ++j) {
               array[i][j] = 10 + array.length * (i + 1) + j;
           }
       }
   }

      public void print2DArray() {

       for (int i = 0; i < array.length; ++i) {
           for (int j = 0; j < array[i].length; ++j) {
               System.out.print(array[i][j] + "  ");
           }
           System.out.println();
       }
   }

   // 2 column array
   public void print2DArrayTransposed() {

       // System.out.println();
       for (int j = 0; j < array[0].length; ++j) {
           System.out.println();
           for (int i = 0; i < array.length; ++i) {
               System.out.print(array[i][j] + "  ");
           }
       }

       System.out.println();
       System.out.println();
   }

   public String getIdentificationString() {
       
       return "Program 4, Youssef Iraqi";

   }

}
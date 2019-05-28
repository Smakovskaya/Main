package org.itstep;

public class Square {
   private double side = 4.0;

   public double getSide(){
      return side;
   }

   public void setSide(double side) {
      this.side = side;
   }

   @Override
   public String toString() {
      return "Square{" +
              "side=" + side +
              '}';
   }
}

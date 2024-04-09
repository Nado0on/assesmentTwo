package assesment;

public class Customer extends Person{
   private Cloth[] clothingItems;
   public void printPriceAfterDiscount(Cloth cloth){
      System.out.println("This is the price after discount: " );
   }

   public Cloth[] getClothingItems() {
      return clothingItems;
   }

   public void setClothingItems(Cloth[] clothingItems) {
      this.clothingItems = clothingItems;
   }



public static void printPriceAfterDiscount(Cloth) {
      double priceAfterDiscount = Cloth.price * 0.90;
      System.out.println("pdiscounted rice = " + priceAfterDiscount);


   }

}

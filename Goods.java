public class Goods {

  int count;
  String name;
  int price;
  String description;
  
  public void print() {
    
      System.out.println(
        String.format(
            "%d, %s, %d, %s",
            this.count, 
            this.name,
            this.price,
            this.description));
      }

}




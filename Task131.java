package Task13;

class Afritada {
  public void showIngredients() {
    String[] Ingredients = {"Tomato Sauce","Meat"};
    System.out.println("Afritada = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
  }
}
// extend Afritada Class here


 
class Caldereta extends Afritada {
  public void showIngredients() {
    String[] Ingredients = 
      {"Tomato Sauce",
       "Meat",
       "Potatoes & Carrots",
       "Tomato Paste",
       "Liver Spread",
       "Raisins",
       "Hotdog",
       "Siling Labuyo",
       "Cheese"};
    System.out.println("Caldereta = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
  }
}

public class Task131 {
    public static void main(String[] args) {
      // add 4 meal$ objects here and set the type as the extended Afritada class
        Afritada meal1 = new Afritada();

      
        Afritada meal4 = new Caldereta();
      // display all ingredients at every object
        meal1.showIngredients();

      
        
    }
}

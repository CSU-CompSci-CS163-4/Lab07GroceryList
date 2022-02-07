import java.util.Arrays;
import java.util.ArrayList;

public class Grocery {
    
    String name = "";
    double price = 0;
    int aisle = 0;
    int calories = 0;

    public Grocery(String groceryStr) {
        ArrayList<String> splitGrocery;
        splitGrocery = new ArrayList<>(Arrays.asList(groceryStr.split("-")));

        name = splitGrocery.get(0);
        /*
        * Here the Double and Integer wrapper class is being used.
        * The values returned from using the str.split("char")
        * are Strings, so any easy conversion is using the Integer
        * Wrapper class to convert a *String* to a *double* or *int*.
        * Here is the Integer Wrapper class Javadoc if you would like to check it out! 
        * https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html
        */
        price = Double.parseDouble(splitGrocery.get(1));
        aisle = Integer.parseInt(splitGrocery.get(2));
        calories = Integer.parseInt(splitGrocery.get(3));
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAisle() {
        return aisle;
    }

    public int getCalories() {
        return calories;
    }

    public String toString() {
        return name + " which costs: $" + price + ", located in the aisle " + aisle + ".";
    }

    public boolean equals(Grocery compareGrocery) {
        if(compareGrocery.getName().equalsIgnoreCase(name)) {
            if(compareGrocery.getPrice() == price) {
                return true;
            }
        }
        return false;
    }
}
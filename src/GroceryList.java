import java.util.ArrayList;

public class GroceryList {
    
    ArrayList<Grocery> grocList = new ArrayList<Grocery>();

    public ArrayList<Grocery> getGrocList() {
        return grocList;
    }

    public void addGrocery(Grocery groc) {
        grocList.add(groc);
    }

    /*
    * Student Self-Explanation:
    * 
    *
    *
    */
    public void removeGrocery(String grocName) {
        for(Grocery g: grocList) {
            if(false) { //TODO Student
                grocList.remove(g);
                break;
            }
        }
    }

    public String toString() {
        String strList = "";
        //TODO Student
        return strList;
    }

    public String getAisleGroceries(int aisle) {
        String aisleString = "";
        //TODO Student
        return aisleString;
    }

    public String getTotals() {
        double priceSum = 0;
        int caloriesSum = 0;
        for(Grocery g: grocList) {
            priceSum += g.getPrice();
            caloriesSum += g.getCalories();
        }
        String rtn = "The total price of this Grocery Trip: $" + priceSum + '\n';
        rtn += "The total calories of this Grocery Trip: " + caloriesSum + "cal\n";
        return rtn;
    }
}
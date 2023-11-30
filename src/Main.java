public class Main {

    public static void calculateTotalMealPrice(double mealPrice, double tipRate, double taxRate) {
        double tip = tipRate*mealPrice;
        double tax = taxRate*mealPrice;
        double result = mealPrice+tip+tax;
        System.out.println("total meal price is "+result);

    }

    public static void main(String[] args) {
        calculateTotalMealPrice(15,0.15,0.08);
        calculateTotalMealPrice(25,0.18,0.08);
    }

}

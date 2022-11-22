public class ChefTester
{
    public static void main(String[] args)
    {
        // Don't modify this part!
        Meal macaroni = new Meal("Mac N Cheese", "Lunch", 8);
        Chef alex = new Chef("Alex", "Juniors Cheesecake", macaroni);
        
        System.out.println(alex);
        System.out.println(alex.getMealName());
        
        // Create your own Meal and Chef here:
        //create new meal
        Meal pancake = new Meal("Pancakes", "Breakfast", 2);
        
        //create new Chef
        Chef anthony = new Chef("Anthony", "Pancake House", pancake);
        
        //prints above info
        System.out.println(anthony);
        System.out.println(anthony.getMealName());
        
    }
}
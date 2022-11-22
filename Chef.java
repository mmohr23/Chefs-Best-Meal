public class Chef
{
    //instance variables
    private String chef;
    private String restaurant;
    private Meal bestMeal;
    
    //has 3 attributes. chefs name, restaurant, best meal they make.
    public Chef(String chefName, String restaurantName, Meal meal){
        chef = chefName;
        restaurant = restaurantName;
        bestMeal = meal;
    }
    
    //following methods
    //getName
    public String getName(){
        return chef;
    }
    
    //getRestaurant
    public String getRestaurant(){
        return restaurant;
    }
    
    //getmeal
    public Meal getMeal(){
        return bestMeal;
    }
    
    //getMealName
    public String getMealName(){
        return bestMeal.getName();
    }
    
    //getMealCourse
    public String getMealCourse(){
        return bestMeal.getCourse();
    }
    
    //getMealServing
    public int getMealServings(){
        return bestMeal.getNumberOfServings();
    }
    
    //toString
    public String toString(){
        return chef + "works at " + restaurant + " and is best known for " + bestMeal;
    }
}
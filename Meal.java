public class Meal
{
    //instance variables
    private String name;
    private String meal;
    private int numServings;
    
    //consists of 3 attributes. name, course, number of servings.
    public Meal(String theName, String mealName, int serving){
        name = theName;
        meal = mealName;
        numServings = serving;
    }
    
    //following methods
    //getName
    public String getName(){
        return name;
    }
    
    //getCourse
    public String getCourse(){
        return meal;
    }
    
    //getNumberofServings
    public int getNumberOfServings(){
        return numServings;
    }
    
    //toString
    public String toString(){
        return name +  " (" + meal + ") ";
    }
}
package codeSignalInterviewPractice;


/*
You have a list of dishes. Each dish is associated with a list of ingredients used to prepare it.
You want to group the dishes by ingredients, so that for each ingredient you'll be able to find all
the dishes that contain it (if there are at least 2 such dishes).

Return an array where each element is a list with the first element equal to the name of the ingredient
and all of the other elements equal to the names of dishes that contain this ingredient.
The dishes inside each list should be sorted lexicographically. The result array should be sorted
lexicographically by the names of the ingredients in its elements.

Example

For
  dishes = [["Salad", "Tomato", "Cucumber", "Salad", "Sauce"],
            ["Pizza", "Tomato", "Sausage", "Sauce", "Dough"],
            ["Quesadilla", "Chicken", "Cheese", "Sauce"],
            ["Sandwich", "Salad", "Bread", "Tomato", "Cheese"]]
the output should be
  groupingDishes(dishes) = [["Cheese", "Quesadilla", "Sandwich"],
                            ["Salad", "Salad", "Sandwich"],
                            ["Sauce", "Pizza", "Quesadilla", "Salad"],
                            ["Tomato", "Pizza", "Salad", "Sandwich"]]
For
  dishes = [["Pasta", "Tomato Sauce", "Onions", "Garlic"],
            ["Chicken Curry", "Chicken", "Curry Sauce"],
            ["Fried Rice", "Rice", "Onions", "Nuts"],
            ["Salad", "Spinach", "Nuts"],
            ["Sandwich", "Cheese", "Bread"],
            ["Quesadilla", "Chicken", "Cheese"]]
the output should be
  groupingDishes(dishes) = [["Cheese", "Quesadilla", "Sandwich"],
                            ["Chicken", "Chicken Curry", "Quesadilla"],
                            ["Nuts", "Fried Rice", "Salad"],
                            ["Onions", "Fried Rice", "Pasta"]]
*/

import java.util.*;

public class GroupingDishes {

    public static ArrayList<String>[] groupingDishes(List<String>[] dishList) {
        ArrayList<String>[] groupedDishes = new ArrayList[10];
        ArrayList<String> ingredients = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            groupedDishes[i] = new ArrayList<String>();
        }
        ArrayList<String>[] finalList = new ArrayList[4];
        for (int i = 0; i < 4; i++) {
            finalList[i] = new ArrayList<String>();
        }


        //Sorting ingredients
        for (int i = 0; i < dishList.length; i++) {
            for (int j = 1; j < dishList[i].size(); j++) {
                if (!ingredients.contains(dishList[i].get(j))) {
                    ingredients.add(dishList[i].get(j));
                    Collections.sort(ingredients);
                }

            }

        }
        //Adding them to grouped list
        for (int j = 0; j < ingredients.size(); j++) {
            groupedDishes[j].add(ingredients.get(j));
        }

        //Adding all dishes
        for (int i = 0; i < dishList.length; i++) {
            for (int j = 0; j < ingredients.size(); j++) {
                if (dishList[i].contains(groupedDishes[j].get(0))) {
                    groupedDishes[j].add(dishList[i].get(0));
                }
            }
        }

        //Removing single cases
        int j = 0;
            for (int i = 0; i < groupedDishes.length; i++) {
                if (groupedDishes[i].size() > 2) {
                    //System.out.println(groupedDishes[i]);
                    finalList[j] = groupedDishes[i];
                    j++;

                }
            }




        return finalList;
    }


}

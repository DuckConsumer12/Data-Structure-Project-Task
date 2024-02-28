import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        colors.add(3, "Black");

        colors.remove(1);

        System.out.println("Colors in the ArrayLists:");
        for(String color : colors){
            System.out.println(color);
        }
        //*Entere Search Term here! */
        String searchTerm = "White";
        String result = searchColor(colors, searchTerm);

        System.out.println("\n" + result);

        }


public static String searchColor(ArrayList<String> colors, String searchTerm) {
    int index = colors.indexOf(searchTerm);
    if (index != -1) {
        return "The color'" + searchTerm + "'is found at position '" + index + "' in thee ArrayList.";
    } else {
        return "Thecolor '" + searchTerm + "' is not found in the ArrayList.";
    }

}


    
}

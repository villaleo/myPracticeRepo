import java.util.List;

public class ApplicationMain {
    public static void main(String[] args) {
        var shoppingList = List.of(
            "Apples",
            "Oranges",
            "Cat Food",
            "Cereal",
            "Bread",
            "Eggs",
            "Oat Milk"
        );

        System.out.println("My shopping list:");
        shoppingList.forEach(System.out::println);
    }
}

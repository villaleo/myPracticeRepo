import java.util.List;

public class ApplicationMain {
    public static void main(String[] args) {
        var shoppingList = List.of(
            "Apples",
            "Bananas",
            "Cat Food",
            "Cereal",
            "Bread",
            "Eggs",
            "Milk"
        );

        System.out.println("My shopping list:");
        shoppingList.forEach(System.out::println);
    }
}

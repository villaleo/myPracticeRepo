import java.util.List;

public class ApplicationMain {
    public static void main(String[] args) {
        var shoppingList = List.of(
            "Apples",
            "Bananas",
            "Dog Food",
            "Cereal",
            "Bread",
            "Eggs",
            "Milk"
        );

        shoppingList.forEach(System.out::println);
    }
}

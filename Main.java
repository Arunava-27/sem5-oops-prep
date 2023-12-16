import java.awt.Color;
public class Main {
    public static void main(String[] args) {
        
        Color myTrunkColor = new Color(102, 51, 0); // used constructor of Color class
        Color myDefaultWhite = Color.WHITE; // used static attribute of Color class
        Color myDefaultBlue = Color.BLUE; // used static attribute of Color class

        Color brightBlue = myDefaultBlue.brighter(); // used instance method of Color class

        System.out.println("My trunk color is "+myTrunkColor+".");
        System.out.println("My default white color is "+myDefaultWhite+".");
        System.out.println("My default blue color is "+myDefaultBlue+".");
        System.out.println("My bright blue color is "+brightBlue+".");
    }
}

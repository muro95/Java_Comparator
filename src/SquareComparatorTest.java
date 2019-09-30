import java.util.Arrays;
import java.util.Comparator;
public class SquareComparatorTest {
    public static void main(String[] args){
        Square[] squares = new Square[3];
        squares[0] = new Square(5);
        squares[1] = new Square();
        squares[2] = new Square(10, "Green", true);

        System.out.println("Pre-sorted: ");
        for (Square square: squares){
            System.out.println(square);
        }

        Comparator squareComparator = new SquareComparator();
        Arrays.sort(squares, squareComparator);

        System.out.println("After-sorted: ");
        for (Square square: squares){
            System.out.println(square);
        }

    }
}

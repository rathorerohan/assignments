import java.util.ArrayList;
import java.util.List;

/* *
 *
 * Lerisoft Assignment
 * This class is intend to solve below issue -
 *
 * */
public class Exercise1 {

    public static void main(String[] args) {
        List<String> arrList = new ArrayList<String>();
        arrList.add("Java");
        arrList.add("Spring");
        arrList.add("Hiberate");

        /* Iterate list object using stream API */

        //arrList.stream().forEach(s -> s);
        arrList.stream().forEach(s -> System.out.println(s));
    }

}

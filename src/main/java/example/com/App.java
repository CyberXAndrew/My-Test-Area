package example.com;
// TODO Площадка для решения задач в среде разработки

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Object> objects = new ArrayList<>();
        System.out.println(objects.toArray().length);

        System.out.println(new Object[0].length);

        System.out.println(String.valueOf(null) + "oo");
    }
}

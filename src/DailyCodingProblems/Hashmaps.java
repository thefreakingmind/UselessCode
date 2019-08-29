package DailyCodingProblems;


import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
    public static void main(String[] args) {
        final Map<String, MyObject> map = new HashMap<>();
        map.put("XYZ", new  MyObject(1,2,"Terry"));
        map.put("ABC", null);
        System.out.println(map.get("XYZ"));
        System.out.println(map.get("ABC"));
        System.out.println(map.containsKey("XYZ"));
        System.out.println(map.containsKey("ABC"));


    }
}

class MyObject{
    int x, y;
    String name;

    public MyObject(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyObject myObject = (MyObject) o;

        if (x != myObject.x) return false;
        if (y != myObject.y) return false;
        return name.equals(myObject.name);
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }
}


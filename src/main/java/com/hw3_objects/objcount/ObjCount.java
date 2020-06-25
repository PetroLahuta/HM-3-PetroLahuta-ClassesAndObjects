package main.java.com.hw3_objects.objcount;

public class ObjCount {
    private static int count;

    public ObjCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
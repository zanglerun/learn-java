/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Supper {
    public String s;
    public Supper(){
        System.out.println("hello Supper");
    }
    public Supper(String s){
        this.s = s;
    }    
}

class Sub extends Supper {
    public int x = 10;
    public Sub(String s){
    }
    public Sub(){
        System.out.println("hello Sub");
    }
}

public class App {
    String[] names = {"java", "test", "demo"};
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        App app = new App();
        List<String> mlist = new ArrayList<String>(Arrays.asList(app.names));
        System.out.println(app.getGreeting());
        System.out.println("====================================");
        for (String name : mlist) {
            System.out.println(name);
        }
        System.out.println("====================================");
        System.out.println(Arrays.asList(app.names).contains("demo"));
        System.out.println("====================================");
        Iterator<String> it = mlist.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.startsWith("demo")){
                it.remove();
            }
        }
        for (String name : mlist) {
            System.out.println(name);
        }
        System.out.println("====================================");
        Sub sub = new Sub();
        System.out.println(sub.x);

        System.out.println("====================================");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(123);
        System.out.println(mlist.getClass() == list2.getClass());
    }
}

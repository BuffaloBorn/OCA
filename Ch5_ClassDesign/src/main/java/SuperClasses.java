/**
 * Created by vitaly on 19.08.15.
 *  1.  The first statement of every constructor is a call to another constructor within the class using this(), or a call to
 *      a constructor in the direct parent class using super().
 *  2.  The super() call may not be used after the first statement of the constructor.
 *  3.  If no super() call is declared in a constructor, Java will insert a no-argument super()as the first statement of the constructor.
 *  4.  If the parent doesn't have a no-argument constructor and the child doesn't define any constructors, the compiler will throw an error
 *      and try to insert a default no-argument constructor into the child class.5.    If the parent doesn't have a no-argument constructor,
 *      the compiler requires an explicit call to a parent constructor in each child constructor.
 */
public class SuperClasses {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println("son.age = " + son.age);

        Father father = new Father();
        System.out.println("father.age = " + father.age);

        GrandFather grandFather = new GrandFather();
        System.out.println("grandFather.age = " + grandFather.age);
    }
}

class Son extends Father {
    public Son(int age) {
        super(age);
    }

    public Son() {
        this(20);
    }
}

class Father extends GrandFather {
    public Father(int age) {
        super(age);
    }

    public Father() {
        this(45);
    }
}

class GrandFather {
    protected int age;
    public GrandFather() {
        this(80);
    }

    public GrandFather(int age) {
        super();
        this.age = age;
    }
}


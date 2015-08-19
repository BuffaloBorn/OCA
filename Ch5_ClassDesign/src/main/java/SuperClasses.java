/**
 * Created by vitaly on 19.08.15.
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


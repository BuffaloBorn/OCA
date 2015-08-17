package packageB;

import packageA.AccessModifiers;

/**
 * Created by Vitaly on 16.08.2015.
 */
public class AccessModifiersChild extends AccessModifiers {
    public AccessModifiersChild() {
        super();
        System.out.println(s);
        System.out.println(l);
    }

    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
        long l = accessModifiers.l;
    }
}

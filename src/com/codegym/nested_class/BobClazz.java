package com.codegym.nested_class;

public class BobClazz {
    private int id;
    private String name;

    class C06Clazz {
        private int id;
        private String name;
    }

    static class C08Clazz {
        private int id;
        private String name;
    }

    public static void main(String[] args) {
        BobClazz.C08Clazz c08Clazz = new BobClazz.C08Clazz();
        System.out.println(c08Clazz);

        BobClazz bobClazz = new BobClazz();
        System.out.println(bobClazz);

        BobClazz.C06Clazz c06Clazz = bobClazz.new C06Clazz();
        System.out.println(c06Clazz);
    }
}

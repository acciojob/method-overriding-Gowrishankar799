package com.driver;

public class Main{
    public static class A{
         static String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        static String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String args[]){
        B b = new B();
        b.meth();
        b.meth();

    }
}
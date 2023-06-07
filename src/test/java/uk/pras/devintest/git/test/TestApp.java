package uk.pras.devintest.git.test;

import org.testng.annotations.Test;

public class TestApp {
    @Test
    public void test1(){
        System.out.println("Running Test1");

    }
    @Test
    public void test2(){
        System.out.println("Running Test2");

    }
    @Test
    public void test3(){
        System.out.println("Running Test3");

    }

    private void doSomething(){
        System.out.println("doing something");
    }
}


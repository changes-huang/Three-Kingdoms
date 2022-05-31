package com.itchanges.test;

import com.itchanges.data.Hero;
import org.junit.Test;

public class ChangesTest {
    @Test
    public void test1() {
        Hero hero = new Hero();
        System.out.println(hero.age);
        System.out.println(hero.toString());
    }
}

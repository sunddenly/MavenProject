package com.hebut;

import org.junit.*;
import static junit.framework.Assert.*;
import com.hebut.Hello;

/**
 * Unit test for TestHello.
 * Junit 3.8.1 规范：不能使用注解，注解要4.0以上才可以
 */
public class TestHello{
    @Test
	public void testHello(){
		Hello h = new Hello();
		assertEquals(h.sayHello("zs"),"hello:zs");
	}
}

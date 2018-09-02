package test;

import IOC.A;
import IOC.LoginService;
import ioc2.Restaurant;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import scope.ScopeBean;
import value.ValueBean;

public class TestCase2 {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/ioc2.xml");
        Restaurant rest = ac.getBean("rest",Restaurant.class);
        System.out.println(rest);
    }
    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/value.xml");
        ValueBean vb1 = ac.getBean("vb1",ValueBean.class);
        System.out.println(vb1);
    }
    @Test
    public void test3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/value.xml");
        System.out.println(ac.getBean("config"));
    }
}

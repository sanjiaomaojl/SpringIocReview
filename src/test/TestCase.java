package test;

import IOC.A;
import IOC.B;
import IOC.LoginService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import scope.ScopeBean;

public class TestCase {
    @Test
    public void testScope(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/scope.xml");
        ScopeBean sb1 = ac.getBean("s1",ScopeBean.class);
        ScopeBean sb2 = ac.getBean("s1",ScopeBean.class);
        System.out.println(sb1 == sb2);
    }
    @Test
    //set方式注入
    public void testIoc(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/ioc.xml");
        A a1 = ac.getBean("a1",A.class);
        a1.execute();
    }
    @Test
    public void testIoc2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/ioc2.xml");
        LoginService ls = ac.getBean("ls",LoginService.class);
        ls.execute();
    }
}

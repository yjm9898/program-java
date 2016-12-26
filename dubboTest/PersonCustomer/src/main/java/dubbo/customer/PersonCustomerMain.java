package dubbo.customer;

import dubbo.service.TestSayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * description:
 * author: <a href="qiaotaosheng@wxchina.com">TaoSheng.Qiao</a>
 * date:  2016-7-15  11:31
 * version: 1.0.0
 */
public class PersonCustomerMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("personCustom_context.xml");
        context.start();
        System.out.println("Person customer had been started!!!");
//        System.in.read();
        TestSayService testSayService = (TestSayService)context.getBean("testsayService");
        String content = testSayService.say("cool,this is my first app about dubbo!!");
        System.out.println(content+"---------");
    }
}

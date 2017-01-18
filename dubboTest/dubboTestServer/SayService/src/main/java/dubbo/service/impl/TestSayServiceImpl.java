package dubbo.service.impl;

import dubbo.entity.Person;
import dubbo.service.TestSayService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: qb
 * date:  2016-7-14  16:18
 * version: 1.0.0
 */

@Service("testSayService")
public class TestSayServiceImpl implements TestSayService {

    private Person person = new Person();

    public String say(String content) {
        person.setName("lihua");
        person.setAge(8);
        return "Service say:" + content + "\n" + person.toString();
    }
}

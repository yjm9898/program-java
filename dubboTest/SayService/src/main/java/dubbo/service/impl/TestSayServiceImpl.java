package dubbo.service.impl;

import dubbo.service.TestSayService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: <a href="qiaotaosheng@wxchina.com">TaoSheng.Qiao</a>
 * date:  2016-7-14  16:18
 * version: 1.0.0
 */

@Service("testSayService")
public class TestSayServiceImpl implements TestSayService {

    public String say(String content) {
        return "Service say:" + content;
    }
}

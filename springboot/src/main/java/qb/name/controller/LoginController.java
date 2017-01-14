package qb.name.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import qb.name.entitys.User;

/**
 * @author qb
 * @version 1.0.0
 * @description:    user login
 * @date 2017-1-14 17:23
 */
@RestController
@EnableAutoConfiguration
public class LoginController {
    private String name1 = "admin";
    private String password1 = "123456";
    @RequestMapping("/login")
    public String login(@RequestParam(value = "name") String name,@RequestParam(value = "password") String password){
        String returnStr = "你的用户名或密码错误！";
        if(name1.equals(name) && password1.equals(password)){
            returnStr = "Hello " +name + ",Nice To Meet You!";
        }
        return returnStr;
    }

    @Value("${name}")
    public void setName1(String name1) {
        this.name1 = name1;
    }

    @Value("${password}")
    public void setPassword1(String password1) {
        this.password1 = password1;
    }
}

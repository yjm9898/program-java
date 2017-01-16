package qb.name.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import qb.name.dao.daoImpl.UserMapperImpl;
import qb.name.entities.User;

/**
 * @author qb
 * @description: user login
 * @date 2017-1-14 17:23
 */
@RestController
@EnableAutoConfiguration
public class LoginController {

    @Autowired
    UserMapperImpl userDao;

    @RequestMapping("/login")
    public String login(@RequestParam(value = "name") String name,
                         @RequestParam(value = "password",required = false) String password){
        if(name == null){
            return "用户名为空！";
        }
        String returnStr = "用户查找失败！";
        User user = userDao.selectUserByName(name);
        if(user != null){
            returnStr = user.toJson();
        }
        return returnStr;
    }
}

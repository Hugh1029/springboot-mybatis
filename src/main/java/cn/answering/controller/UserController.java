package cn.answering.controller;

import cn.answering.model.User;
import cn.answering.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zjp on 2018/4/14.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{id}")
    @ResponseBody
    public String getUser(@PathVariable(value = "id") Integer id) {
        User user = userService.selectUserById(id);
        System.out.println(userService.selectAllCount());
        User user1 = userService.selectUserByPhone("15366088223");
        System.out.println(user1.toString());
        return user.toString();
    }
}

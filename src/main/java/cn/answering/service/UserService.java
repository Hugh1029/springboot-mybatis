package cn.answering.service;

import cn.answering.model.User;

/**
 * Created by zjp on 2018/4/14.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 */
public interface UserService {

    public void saveUser(User user);

    public User selectUserById(Integer id);

    public void deleteUserById(Integer id);

    public Integer selectAllCount();

    public User selectUserByPhone(String phone);
}

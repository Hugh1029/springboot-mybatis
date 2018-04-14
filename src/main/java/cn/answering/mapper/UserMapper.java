package cn.answering.mapper;

import cn.answering.model.User;
import cn.answering.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by zjp on 2018/4/11.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 */
public interface UserMapper extends MyMapper<User> {

    @Select("SELECT COUNT(*) FROM tb_user")
    public Integer selectAllCount();

    public User selectUserByPhone(@Param("phone") String phone);

}

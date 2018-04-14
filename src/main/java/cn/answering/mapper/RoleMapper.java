package cn.answering.mapper;

import cn.answering.model.Role;
import cn.answering.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by zjp on 2018/4/14.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 */

@Mapper
public interface RoleMapper extends MyMapper<Role> {

    @Select("SELECT COUNT(*) FROM tb_role")
    public Integer selectAllCount();
}

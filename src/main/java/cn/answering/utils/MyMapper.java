package cn.answering.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by zjp on 2018/4/14.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 * 该接口不能被扫描到，否则会报错
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

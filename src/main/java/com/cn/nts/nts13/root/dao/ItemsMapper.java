package com.cn.nts.nts13.root.dao;

import com.cn.nts.nts13.root.entity.Items;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface ItemsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Items record);

    Items selectByPrimaryKey(Integer id);

    List<Items> selectAll();

    int updateByPrimaryKey(Items record);

    List<Items> selectByExample(Example example);
}
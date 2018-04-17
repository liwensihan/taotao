package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2018-04-17.
 */
@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long itemId){
        TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
        return tbItem;
    }
}

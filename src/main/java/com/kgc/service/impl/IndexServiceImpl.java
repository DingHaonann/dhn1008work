package com.kgc.service.impl;

import com.kgc.mapper.BillsMapper;
import com.kgc.pojo.Bills;
import com.kgc.pojo.BillsExample;
import com.kgc.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {
    @Resource
    BillsMapper billsMapper;

    @Override
    public List<Bills> selall() {
        return billsMapper.selectByExample(null);
    }

    @Override
    public List<Bills> selBy(Integer type) {
        BillsExample example = new BillsExample();
        BillsExample.Criteria criteria = example.createCriteria();
        criteria.andTypeIdEqualTo(type);
        return billsMapper.selectByExample(example);
    }

    @Override
    public int add(Bills bills) {
        return billsMapper.insert(bills);
    }
}

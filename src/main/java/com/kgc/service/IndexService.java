package com.kgc.service;

import com.kgc.pojo.Bills;

import java.util.List;

/**
 * @author shkstart
 */
public interface IndexService {
    List<Bills> selall();

    List<Bills> selBy(Integer type);

    int add(Bills bills);
}

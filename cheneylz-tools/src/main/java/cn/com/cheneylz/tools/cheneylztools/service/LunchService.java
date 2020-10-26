package cn.com.cheneylz.tools.cheneylztools.service;

import cn.com.cheneylz.tools.cheneylztools.entity.Lunch;

public interface LunchService {

    Lunch getRandomLunch();

    boolean  saveLunch(Lunch lunch);

    void deleteLunch(String lunchId);


}

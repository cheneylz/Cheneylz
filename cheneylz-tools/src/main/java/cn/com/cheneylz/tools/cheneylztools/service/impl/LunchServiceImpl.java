package cn.com.cheneylz.tools.cheneylztools.service.impl;


import cn.com.cheneylz.tools.cheneylztools.dao.LunchDao;
import cn.com.cheneylz.tools.cheneylztools.entity.Lunch;
import cn.com.cheneylz.tools.cheneylztools.service.LunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class LunchServiceImpl implements LunchService {
    @Autowired
    LunchDao lunchDao;

    @Override
    public Lunch getRandomLunch() {
        List<Lunch> lunchList = lunchDao.findAll();
        Random random = new Random();
        int randomIndex = random.nextInt(lunchList.size());
        return  lunchList.get(randomIndex);
    }

    @Override
    public boolean saveLunch(Lunch lunch) {
        Lunch saveLunch = lunchDao.save(lunch);
        if (saveLunch!=null){
            return  true;
        }
        return  false;
    }

    @Override
    public void deleteLunch(String lunchId) {
        lunchDao.deleteById(lunchId);
    }
}

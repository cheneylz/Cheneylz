package cn.com.cheneylz.tools.cheneylztools.dao;

import cn.com.cheneylz.tools.cheneylztools.entity.Lunch;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LunchDao extends MongoRepository<Lunch,String> {
}

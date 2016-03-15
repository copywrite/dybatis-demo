package com.copywrite.dybatis.dao;

import com.copywrite.dybatis.bean.DogeDO;
import com.copywrite.dybatis.bean.DogeQuery;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by copywrite on 16/3/14.
 */

@Service
public class DogeDAO extends BaseDAO {

    private static final String NAMESPACE = "DogeDAO.";

    /**
     * query a list
     *
     * @param dogeQuery query
     * @return List
     */
    @SuppressWarnings("unchecked")
    public List<DogeDO> getList(DogeQuery dogeQuery) throws Exception {
        try{
            return (List<DogeDO>) sqlMapClientTemplate.queryForList(NAMESPACE + "query", dogeQuery);
        }catch (Exception e){
            throw new Exception(e);
        }
    }
}
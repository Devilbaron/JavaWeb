package com.demon.modules.sys.dao;

import com.demon.common.persistence.CrudDao;
import com.demon.common.persistence.annotation.MyBatisDao;
import com.demon.modules.sys.entity.Log;

/**
        * 日志DAO接口
        * @author ThinkGem
        * @version 2014-05-16
        */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
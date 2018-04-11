package com.demon.modules.sys.dao;

import com.demon.common.persistence.TreeDao;
import com.demon.common.persistence.annotation.MyBatisDao;
import com.demon.modules.sys.entity.Area;

/**
 * 区域DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {

}
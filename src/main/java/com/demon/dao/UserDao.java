package com.demon.dao;

import com.demon.entity.User;

public interface UserDao {
    /*
    * 通过id返回用户
    *
    * @param id
    * return
    */

    User queryId(long id);
}

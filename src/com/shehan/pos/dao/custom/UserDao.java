package com.shehan.pos.dao.custom;

import com.shehan.pos.dao.CrudDao;
import com.shehan.pos.entity.Customer;
import com.shehan.pos.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao extends CrudDao<User,String> {

}
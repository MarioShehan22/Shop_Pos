package com.shehan.pos.dao.custom;

import com.shehan.pos.dao.CrudDao;
import com.shehan.pos.entity.Customer;
import com.shehan.pos.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao extends CrudDao<Product, Integer> {


    //----------------------------------
    public  int getLastProductId() throws SQLException, ClassNotFoundException;
}
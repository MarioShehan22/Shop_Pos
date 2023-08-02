package com.shehan.pos.dao.custom.impl;

import com.shehan.pos.dao.CrudUtil;
import com.shehan.pos.dao.custom.OrderDetailDao;
import com.shehan.pos.entity.OrderDetail;

import java.sql.SQLException;
import java.util.List;

public class OrderDetailDaoImpl implements OrderDetailDao {
    @Override
    public boolean save(OrderDetail o) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("INSERT INTO order_detail VALUES(?,?,?,?,?,?)",
                o.getCode(),o.getIssuedDate(),o.getTotalCost(),o.getCustomerEmail(),o.getDiscount(),o.getOperatorEmail());
    }

    @Override
    public boolean update(OrderDetail orderDetail) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(Integer integer) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public OrderDetail find(Integer integer) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public List<OrderDetail> findAll() throws SQLException, ClassNotFoundException {
        return null;
    }
}

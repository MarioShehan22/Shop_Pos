package com.shehan.pos.dao.custom;

import com.shehan.pos.dao.CrudDao;
import com.shehan.pos.dto.CustomerDto;
import com.shehan.pos.entity.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao extends CrudDao<Customer, String> {
    //-------------------------
    public List<Customer> searchCustomers(String searchText) throws SQLException, ClassNotFoundException;

}

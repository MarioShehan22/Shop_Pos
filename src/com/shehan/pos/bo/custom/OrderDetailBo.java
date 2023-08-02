package com.shehan.pos.bo.custom;

import com.shehan.pos.dto.OrderDetailDto;

import java.sql.SQLException;

public interface OrderDetailBo {
    public boolean makeOrder(OrderDetailDto d) throws SQLException;
}

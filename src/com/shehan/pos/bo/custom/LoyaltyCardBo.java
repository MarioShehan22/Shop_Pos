package com.shehan.pos.bo.custom;

import com.shehan.pos.dto.LoyaltyCardDto;

import java.sql.SQLException;

public interface LoyaltyCardBo {
    public boolean saveLoyaltyData(LoyaltyCardDto d) throws SQLException, ClassNotFoundException;
}

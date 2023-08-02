package com.shehan.pos.bo.custom;

import com.shehan.pos.bo.SuperBo;
import com.shehan.pos.dto.ProductDetailDto;
import com.shehan.pos.dto.ProductDetailJoinDto;
import com.shehan.pos.dto.ProductDto;
import com.shehan.pos.dto.UserDto;
import com.shehan.pos.entity.ProductDetail;

import java.sql.SQLException;
import java.util.List;

public interface ProductDetailBo extends SuperBo {
    public boolean saveProductDetail(ProductDetailDto dto) throws SQLException, ClassNotFoundException;
    public List<ProductDetailDto> findAllProductDetails(int productCode) throws SQLException, ClassNotFoundException;
    public ProductDetailDto findProductDetail(String code) throws SQLException, ClassNotFoundException;
    public ProductDetailJoinDto findProductJoinDetail(String code) throws SQLException, ClassNotFoundException;
}
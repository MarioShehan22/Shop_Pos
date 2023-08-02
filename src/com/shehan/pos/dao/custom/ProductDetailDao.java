package com.shehan.pos.dao.custom;

import com.shehan.pos.dao.CrudDao;
import com.shehan.pos.dto.ProductDetailDto;
import com.shehan.pos.dto.ProductDetailJoinDto;
import com.shehan.pos.dto.ProductDto;
import com.shehan.pos.entity.ProductDetail;

import java.sql.SQLException;
import java.util.List;

public interface ProductDetailDao extends CrudDao<ProductDetail, String> {
    public List<ProductDetail> findAllProductDetails(int productCode) throws SQLException, ClassNotFoundException;
    public ProductDetail findProductDetail(String code) throws SQLException, ClassNotFoundException;
    public ProductDetailJoinDto findProductDetailJoinData(String code) throws SQLException, ClassNotFoundException;
    public boolean manageQty(String barcode, int qty) throws SQLException, ClassNotFoundException;
}
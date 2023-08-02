package com.shehan.pos.bo.custom;

import com.shehan.pos.bo.SuperBo;
import com.shehan.pos.dto.ProductDto;

import java.sql.SQLException;
import java.util.List;

public interface ProductBo extends SuperBo {
    public boolean saveProduct(ProductDto dto) throws SQLException, ClassNotFoundException;
    public boolean updateProduct(ProductDto dto);
    public boolean deleteProduct(int code);
    public ProductDto findProduct(int code);
    public List<ProductDto> findAllProducts() throws SQLException, ClassNotFoundException;
    public int getLastProductId() throws SQLException, ClassNotFoundException;
}

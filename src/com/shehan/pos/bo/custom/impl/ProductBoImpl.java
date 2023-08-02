package com.shehan.pos.bo.custom.impl;

import com.shehan.pos.bo.custom.ProductBo;
import com.shehan.pos.dao.DaoFactory;
import com.shehan.pos.dao.custom.ProductDao;
import com.shehan.pos.dto.ProductDto;
import com.shehan.pos.entity.Product;
import com.shehan.pos.enums.DaoType;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductBoImpl implements ProductBo {
    ProductDao productDao = DaoFactory.getInstance().getDao(DaoType.PRODUCT);

    @Override
    public boolean saveProduct(ProductDto dto) throws SQLException, ClassNotFoundException {
        return productDao.save(new Product(dto.getCode(), dto.getDescription()));
    }

    @Override
    public boolean updateProduct(ProductDto dto) {
        return false;
    }

    @Override
    public boolean deleteProduct(int code) {
        return false;
    }

    @Override
    public ProductDto findProduct(int code) {
        return null;
    }

    @Override
    public List<ProductDto> findAllProducts() throws SQLException, ClassNotFoundException {
        List<ProductDto> dtos = new ArrayList<>();
        for (Product p : productDao.findAll()
        ) {
            dtos.add(new ProductDto(p.getCode(), p.getDescription()));/* data drop wait*/
        }
        return dtos;
    }

    public int getLastProductId() throws SQLException, ClassNotFoundException {
        return productDao.getLastProductId();
    }
}



package com.jacklinsir.redis.dao;

import com.jacklinsir.redis.model.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author linSir
 * @version V1.0
 * @Date 2020/1/24 13:24
 */
public interface ProductDao {

    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("insert into product(name,user_id,scan_total,is_active)values (#{name} ,#{userId} ,#{scanTotal} ,#{isActive} )")
    int addProduct(Product product);

    @Select("select * from product where user_id = #{userId}")
    List<Product> getProducts(Long userId);

}

package com.shawn.sell.dao;

import com.shawn.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Author: Shawn
 * @Date: 2019/1/25 19:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

        @Test
        public void findOneTest(){
          ProductCategory productCategory =  repository.findById(1).get();
            System.out.println(productCategory.toString());
        }
        @Test
        public void saveTest(){
            ProductCategory productCategory =  repository.findById(2).get();
            productCategory.setCategoryType(3);
            repository.save(productCategory);
        }
}
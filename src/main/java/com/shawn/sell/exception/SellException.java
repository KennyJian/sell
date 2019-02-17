package com.shawn.sell.exception;

import com.shawn.sell.enums.ResultEnum;

/**
 * @Author: Shawn
 * @Date: 2019/2/17 22:17
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }



}
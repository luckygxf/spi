package com.gxf.spi.impl;

import com.gxf.spi.HelloInterface;

/**
 * @Author: <guanxiangfei@meituan.com>
 * @Description:
 * @Date: Created in : 2018/11/20 2:54 PM
 **/
public class TextHello implements HelloInterface {

  public void sayHello() {
    System.out.println("Text hello");
  }
}

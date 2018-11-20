package com.gxf.spi;

import com.sun.tools.javac.util.ServiceLoader;

/**
 * @Author: <guanxiangfei@meituan.com>
 * @Description:
 * @Date: Created in : 2018/11/20 2:54 PM
 **/
public class SPIMain {

  public static void main(String[] args) {
    ServiceLoader<HelloInterface> loaders = ServiceLoader.load(HelloInterface.class);
    for(HelloInterface in : loaders){
      in.sayHello();
    }
  }
}

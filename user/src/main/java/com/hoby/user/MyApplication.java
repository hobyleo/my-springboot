package com.hoby.user;

import com.hoby.springboot.MySpringApplication;
import com.hoby.springboot.annotation.MySpringBootApplication;

/**
 * @author hoby
 * @since 2024-01-12
 */
@MySpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        MySpringApplication.run(MyApplication.class, args);
    }

}

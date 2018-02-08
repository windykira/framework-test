package com.baitengsoft.smart;

import com.baitengsoft.framework.annotation.Controller;
import com.baitengsoft.framework.annotation.Inject;
import com.baitengsoft.framework.annotation.Request;

/**
 * Created by windy on 2018/2/7.
 */
@Controller
public class TestController {

    @Inject
    private TestService testService;

    @Request.Get("/product/{id}")
    public void getProductById(long productId) {

    }
}

package com.hackeru.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright: Copyright (c) 2021 Asiainfo
 *
 * @className: com.hackeru.demo.controller.HelloWordController
 * @description:
 * @version: v1.0.0
 * @author: liangyl
 * @date: 2021/11/24
 * <p>
 * Modification History:
 * Date         Author         Version          Description
 * -----------------------------------------------------------------------*
 * 2021/11/24		liangyl        v1.0.0		    创建
 */
@Controller
public class HelloWordController {

    @RequestMapping("/")
    public String helloWorld() {
        return "helloworld";
    }

}

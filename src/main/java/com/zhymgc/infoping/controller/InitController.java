package com.zhymgc.infoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * simple description
 *
 * @Description: java class description
 * @Author: 张昊
 * @CreateDate: 2019/6/20 11:19
 * @Version: 1.0
 * <p>Copyright: 内蒙古金财信息技术有限公司 (c) 2019</p>
 */
@Controller
public class InitController {
    @RequestMapping("/test")
    public String getInfo(){
        return "welcome";
    }
}

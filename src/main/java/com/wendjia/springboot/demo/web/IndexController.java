package com.wendjia.springboot.demo.web;

import com.wendjia.springboot.demo.model.WendjiaProteries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
@EnableAutoConfiguration
public class IndexController{

    @Autowired
    WendjiaProteries wendjiaProteries;

    @RequestMapping("/index")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping("/test")
    public  void test(HttpServletResponse response) throws IOException {
        response.sendRedirect("http://www.baidu.com");
    }

    @RequestMapping("/getvalue")
    public String getvalue(){
        return wendjiaProteries.getShowName()+"wendjia";
    }

    @RequestMapping("/wendjia")
    public String testExcept() throws Exception {
        throw new Exception();
    }
}

package cn.sueyun.controller;

import cn.sueyun.rest.CodeMsg;
import cn.sueyun.rest.Result;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author gfc
 * 2018年11月17日 下午 5:24
 */
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public Result<String> hello() {
        return Result.success("hello");
    }

    @RequestMapping("/helloError")
    public Result<String> helloError() {
        return Result.error(CodeMsg.ERROR);
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model) {
        model.addAttribute("name", "thymeleaf");
        return "hello";
    }
}

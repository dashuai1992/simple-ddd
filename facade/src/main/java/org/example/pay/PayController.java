package org.example.pay;

import org.example.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pay")
public class PayController {
    private final TemplatePayService templatePayService;
    public PayController(TemplatePayService templatePayService) {
        this.templatePayService = templatePayService;
    }

    @GetMapping("init")
    public Result initPay(@RequestParam("type") String type, @RequestParam("orderId") String orderId) {
        return Result.ok(templatePayService.initPayForOrder(type, orderId));
    }

    @GetMapping("callBack")
    public Result callBack(String data) {
        templatePayService.callBackProcess("ALI", data);
        return Result.ok();
    }

    @GetMapping("queryBills")
    public Result queryBills(String data) {
        return Result.ok(templatePayService.queryBills("ALI", data));
    }
}

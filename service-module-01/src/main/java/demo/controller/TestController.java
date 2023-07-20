package demo.controller;


import com.example.demo.mapper.CenterSupplyProductMapper;
import com.example.demo.common.api.CommonResult;
import com.example.demo.model.CenterSupplyProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private CenterSupplyProductMapper productMapper;


    @GetMapping("/get01")
    public CommonResult get01(Integer id){
        CenterSupplyProduct p = productMapper.selectByPrimaryKey(id);
        return CommonResult.success(p);
    }


    @GetMapping("/get")
    public Stu getStu(){
        Stu s = new Stu();
        s.setName("zhp");
        s.setTime(new Date());
        return s;
    }

    @PostMapping("/add")
    public Stu add(@RequestBody Stu s){
        System.out.println(s);
        return s;
    }

}

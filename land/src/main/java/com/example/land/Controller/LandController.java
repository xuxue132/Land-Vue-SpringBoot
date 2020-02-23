package com.example.land.Controller;

import com.example.land.Model.Landtable;
import com.example.land.Service.LandService2;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class LandController {
    @Resource
    private LandService2 landService2;

    @PostMapping("/land")
    public String landspring(@RequestBody Landtable user){
        Landtable book = landService2.LandUser(user.getName(),user.getPassword());
        if(book!=null){
            return "登陆成功";}
        else
            return "密码错误";
    }

    @PostMapping(value = "/add")
    public String addspring(String name,String password){
        Landtable book = landService2.LandUser2(name);
        int s = landService2.All().size()+1;
        if(book!=null)
            return "用户已存在";
        else {
            book=new Landtable();
            book.setId(s);
            book.setName(name);
            book.setPassword(password);
            int as=landService2.insertUser(book);
            return "创建成功";
        }
    }
}

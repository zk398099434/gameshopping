package cn.zkgamelife.gameshopping.controller;

import cn.zkgamelife.domain.Employee;
import cn.zkgamelife.gameshopping.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("admin".equals(employee.getName())&&"0".equals(employee.getPassword())){
            return AjaxResult.me();
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或密码不正确!");
    }
}

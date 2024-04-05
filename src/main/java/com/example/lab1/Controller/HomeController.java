package com.example.lab1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/principal")
    public String vistaPrincipal(@RequestParam(value = "code",required = false) String code){
        if(code!=null&&code.equals("PUCP")){
            return "vistaPrincipal2";
        }else{
            return "vistaPrincipal";
        }

    }
}
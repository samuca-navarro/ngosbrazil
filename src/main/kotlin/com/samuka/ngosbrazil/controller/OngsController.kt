package com.samuka.ngosbrazil.controller

import com.samuka.ngosbrazil.model.Ngo
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("ongs")
class OngsController {

    @GetMapping
    @ResponseBody
    fun listOngs(): List<Ngo>{
        return listOf (Ngo("Educação para todos", "rua a", "bloco 13", "São Paulo",
        "São Paulo", "03566040", "Brazil", "educacaoong@gmail.com", "educacaoparatodos.com",
        listOf("rede1", "rede2")))
    }
}
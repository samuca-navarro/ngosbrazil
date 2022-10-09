package com.samuka.ngosbrazil.controller

import com.samuka.ngosbrazil.model.Ngo
import com.samuka.ngosbrazil.repository.NgoRepository
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("ongs")
class NgoController (val ngoRepository: NgoRepository) {

//    @GetMapping
//    fun listOngs(): List<Ngo>{
//        return listOf (Ngo("1","Educação para todos", "rua a", "bloco 13", "São Paulo",
//        "São Paulo", "03566040", "Brazil", "educacaoong@gmail.com", "educacaoparatodos.com", "ativa",
//        listOf("rede1", "rede2")))
//    }

    @PostMapping
    fun create(@RequestBody ngo: Ngo): ResponseEntity<Ngo> {
        val ngoSave = ngoRepository.save(ngo)
        return ResponseEntity.ok(ngoSave)
    }
}
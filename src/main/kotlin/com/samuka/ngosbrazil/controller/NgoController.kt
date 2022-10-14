package com.samuka.ngosbrazil.controller

import com.samuka.ngosbrazil.model.Ngo
import com.samuka.ngosbrazil.repository.NgoRepository
import com.samuka.ngosbrazil.service.NgoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("ongs")
class NgoController () {

    @Autowired
    lateinit var ngoService: NgoService

    @Autowired
    lateinit var ngoRepository: NgoRepository

    @GetMapping("api/{issue}")
    fun returnMatter(@PathVariable("issue") issue: String): ResponseEntity<List<Ngo>>{
       val ongs = ngoRepository.findNgoByIssue(issue)
       return ResponseEntity.ok(ongs)
    }

    @PostMapping
    fun create(@RequestBody ngo: Ngo): ResponseEntity<Ngo> {
        val ngoSave = ngoService.createNgo(ngo)
        return ResponseEntity.ok(ngoSave)
    }
}
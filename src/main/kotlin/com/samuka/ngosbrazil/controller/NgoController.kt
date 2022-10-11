package com.samuka.ngosbrazil.controller

import com.samuka.ngosbrazil.model.Ngo
import com.samuka.ngosbrazil.repository.NgoRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("ongs")
class NgoController (val ngoRepository: NgoRepository) {

    @GetMapping("api/{issue}")
    fun returnMatter(@PathVariable("issue") issue: String): ResponseEntity<List<Ngo>>{
       val ongs = ngoRepository.findNgoByMatter(issue)
       return ResponseEntity.ok(ongs)
    }

    @PostMapping
    fun create(@RequestBody ngo: Ngo): ResponseEntity<Ngo> {
        val ngoSave = ngoRepository.save(ngo)
        return ResponseEntity.ok(ngoSave)
    }
}
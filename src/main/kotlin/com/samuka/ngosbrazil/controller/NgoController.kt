package com.samuka.ngosbrazil.controller
import com.samuka.ngosbrazil.model.Ngo
import com.samuka.ngosbrazil.service.NgoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("ongs")
class NgoController (val ngoService: NgoService) {

    @GetMapping("api/{issue}")
    fun returnByMatter(@PathVariable("issue") issue: String): ResponseEntity<List<Ngo>>{
       val ngos = ngoService.findNgoByIssue(issue)
       return ResponseEntity.ok(ngos)
    }

    @GetMapping("api/{city}")
    fun returnByCity(@PathVariable("city") city: String): ResponseEntity<List<Ngo>>{
        val ngos = ngoService.findNgoByCity(city)
        return ResponseEntity.ok(ngos)
    }

    @PostMapping
    fun create(@RequestBody ngo: Ngo): ResponseEntity<Ngo> {
        val ngoSave = ngoService.createNgo(ngo)
        return ResponseEntity.ok(ngoSave)
    }

    @DeleteMapping
    fun delete(@PathVariable id: String){
        ngoService.deleteNgoById(id)
    }



}
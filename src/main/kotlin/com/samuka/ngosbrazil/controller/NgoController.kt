package com.samuka.ngosbrazil.controller
import com.samuka.ngosbrazil.model.Ngo
import com.samuka.ngosbrazil.service.NgoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("ongs")
class NgoController (val ngoService: NgoService) {

//    @Autowired
//    lateinit var ngoService: NgoService

//    @Autowired
//    lateinit var ngoRepository: NgoRepository

    @GetMapping("api/{issue}")
    fun returnMatter(@PathVariable("issue") issue: String): ResponseEntity<List<Ngo>>{
       val ngos = ngoService.findNgoByIssue(issue)
       return ResponseEntity.ok(ngos)
    }

    @PostMapping
    fun create(@RequestBody ngo: Ngo): ResponseEntity<Ngo> {
        val ngoSave = ngoService.createNgo(ngo)
        return ResponseEntity.ok(ngoSave)
    }
}
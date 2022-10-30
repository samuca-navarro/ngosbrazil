package com.samuka.ngosbrazil.service

import com.samuka.ngosbrazil.model.Ngo
import com.samuka.ngosbrazil.repository.NgoRepository
import org.springframework.stereotype.Service

@Service
class NgoService (val ngoRepository: NgoRepository) {

    fun createNgo(ngo: Ngo): Ngo = ngoRepository.save(ngo)

    fun findNgoByIssue(issue: String): List<Ngo> = ngoRepository.findNgoByIssue(issue)
}
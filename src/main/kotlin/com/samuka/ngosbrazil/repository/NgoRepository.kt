package com.samuka.ngosbrazil.repository

import com.samuka.ngosbrazil.model.Ngo
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface NgoRepository : MongoRepository<Ngo, String>  {

    @Query("{issue:'?0'}")
    fun findNgoByIssue(issue: String): List<Ngo>

}
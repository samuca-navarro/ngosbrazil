package com.samuka.ngosbrazil.repository

import com.samuka.ngosbrazil.model.Ngo
import org.springframework.data.mongodb.repository.MongoRepository

interface NgoRepository : MongoRepository<Ngo, String>  {

}
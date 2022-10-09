package com.samuka.ngosbrazil.model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Ngo(
          val id: String,
          val name: String,
          val adressLine1: String,
          val adressLine2: String,
          val city: String,
          val province: String,
          val zipCode: String,
          val country: String,
          val email: String,
          val site: String,
          val status: String,
          val socialNetworks: List<String>
        )


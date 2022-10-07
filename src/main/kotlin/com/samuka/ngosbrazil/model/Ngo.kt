package com.samuka.ngosbrazil.model

class Ngo(val name: String,
          val adressLine1: String,
          val adressLine2: String,
          val city: String,
          val province: String,
          val zipCode: String,
          val country: String,
          val email: String,
          val site: String,
          val socialNetworks: List<String>
        )
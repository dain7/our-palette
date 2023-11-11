package com.project.dain.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class PlaceImage (
        val url: String,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long
)
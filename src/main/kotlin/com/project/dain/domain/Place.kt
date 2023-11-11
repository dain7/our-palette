package com.project.dain.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class Place (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        val location: String,

        val color: String,

        val memo: String,

        @ManyToOne
        @JoinColumn(name = "plan_id")
        val plan: Plan

)
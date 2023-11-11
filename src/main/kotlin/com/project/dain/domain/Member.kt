package com.project.dain.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class Member (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        val name: String,

        @ManyToOne
        @JoinColumn(name = "team_id")
        val team: Team?
)
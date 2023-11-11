package com.project.dain.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class Team (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        val name: String,

        val leaderId: Long,

        @OneToMany(mappedBy = "team")
        val members: MutableList<Member> = mutableListOf(),

        @OneToMany(mappedBy = "team")
        val plans: MutableList<Plan> = mutableListOf(),
)
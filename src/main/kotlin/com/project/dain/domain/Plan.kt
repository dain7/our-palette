package com.project.dain.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

@Entity
class Plan (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        val date: Int,

        val regId: Long,

        @ManyToOne
        @JoinColumn(name = "team_id")
        val team: Team,

        @OneToMany(mappedBy = "plan")
        val places: MutableList<Place> = mutableListOf()
)
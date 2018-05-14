package org.jorgehernandezramirez.kotlin.helloworld.dao.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="strategies")
data class Strategy(

        @Id
        @Column(name = "id")
        val id: Long,

        @Column(name = "name")
        val name: String,

        @Column(name = "percentage")
        var percentage: Double)
{
    private constructor(): this(-1, "", 0.0)
}
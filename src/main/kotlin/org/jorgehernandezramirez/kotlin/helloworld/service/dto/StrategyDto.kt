package org.jorgehernandezramirez.kotlin.helloworld.service.dto

data class StrategyDto(val id: Long, val name: String, var percentage: Double){
    private constructor(): this(-1, "", 0.0)
}
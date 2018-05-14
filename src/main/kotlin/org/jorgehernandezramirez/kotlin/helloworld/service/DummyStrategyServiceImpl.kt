package org.jorgehernandezramirez.kotlin.helloworld.service

import org.jorgehernandezramirez.kotlin.helloworld.service.dto.StrategyDto

//@Service
class DummyStrategyServiceImpl : IStrategyService{

    override fun getStrategies(): List<StrategyDto> =
        listOf(StrategyDto(id = 1, name = "Mi Estrategy", percentage = 0.98))

}
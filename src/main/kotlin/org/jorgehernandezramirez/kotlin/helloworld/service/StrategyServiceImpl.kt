package org.jorgehernandezramirez.kotlin.helloworld.service

import org.jorgehernandezramirez.kotlin.helloworld.dao.entities.Strategy
import org.jorgehernandezramirez.kotlin.helloworld.dao.repository.StrategyRepository
import org.jorgehernandezramirez.kotlin.helloworld.service.dto.StrategyDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StrategyServiceImpl : IStrategyService{

    @Autowired
    lateinit private var strategyRepository: StrategyRepository;

    override fun getStrategies(): List<StrategyDto> {
        return strategyRepository.findAll().map{strategy -> buildStrategyDto(strategy)}
    }

    fun buildStrategyDto(strategy: Strategy): StrategyDto{
        return StrategyDto(strategy.id, strategy.name, strategy.percentage)
    }

}
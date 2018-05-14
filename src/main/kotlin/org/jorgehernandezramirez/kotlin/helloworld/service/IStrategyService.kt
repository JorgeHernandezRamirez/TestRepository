package org.jorgehernandezramirez.kotlin.helloworld.service

import org.jorgehernandezramirez.kotlin.helloworld.service.dto.StrategyDto

interface IStrategyService{

    /**
     * Método que devuelve las estrategias del sistema
     */
    fun getStrategies() : List<StrategyDto>;
}
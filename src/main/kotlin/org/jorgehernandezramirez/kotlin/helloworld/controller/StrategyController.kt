package org.jorgehernandezramirez.kotlin.helloworld.controller

import org.jorgehernandezramirez.kotlin.helloworld.service.IStrategyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.Mapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StrategyController {

    @Autowired
    lateinit private var strategyService: IStrategyService;

    @GetMapping("/strategies")
    fun getStrategies() =
        strategyService.getStrategies();

}

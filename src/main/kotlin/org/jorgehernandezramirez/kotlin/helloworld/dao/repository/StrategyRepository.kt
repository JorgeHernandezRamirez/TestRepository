package org.jorgehernandezramirez.kotlin.helloworld.dao.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.jorgehernandezramirez.kotlin.helloworld.dao.entities.Strategy

interface StrategyRepository: JpaRepository<Strategy, Long>
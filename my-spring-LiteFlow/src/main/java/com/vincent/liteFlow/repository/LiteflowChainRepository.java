package com.vincent.liteFlow.repository;

import com.vincent.liteFlow.entity.LiteflowChain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiteflowChainRepository extends JpaRepository<LiteflowChain, Integer> {
}

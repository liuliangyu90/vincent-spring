package com.vincent.liteFlow.repository;


import com.vincent.liteFlow.entity.LiteflowScript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiteflowScriptRepository extends JpaRepository<LiteflowScript, Integer> {
}

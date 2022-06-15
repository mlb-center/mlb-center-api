package com.rubenleerentveld.mlbcenter.Repository;

import java.util.Optional;

import com.rubenleerentveld.mlbcenter.Models.ERole;
import com.rubenleerentveld.mlbcenter.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
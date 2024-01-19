package Trainingjava.Use.repository;

import Trainingjava.Use.entity.UseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UseRepository extends JpaRepository <UseEntity, String>{
}

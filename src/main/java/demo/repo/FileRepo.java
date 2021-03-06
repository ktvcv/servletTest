package demo.repo;

import demo.model.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface FileRepo extends JpaRepository<File, Integer> {
}

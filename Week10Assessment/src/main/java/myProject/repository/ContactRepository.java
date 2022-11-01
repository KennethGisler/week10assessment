package myProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myProject.beans.Units;

@Repository
public interface ContactRepository extends JpaRepository<Units,Long> {}

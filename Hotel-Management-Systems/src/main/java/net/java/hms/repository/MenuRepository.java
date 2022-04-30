package net.java.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.hms.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long>
{
	
}

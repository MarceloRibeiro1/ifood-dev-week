package me.dio.sacola.repository;

import jdk.jfr.Registered;
import me.dio.sacola.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface ItemRepository extends JpaRepository<Item, Long> {
}

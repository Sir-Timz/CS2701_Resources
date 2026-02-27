package com.example.demo.Repos;

import com.example.demo.Models.OrderedItems;
import org.springframework.data.repository.CrudRepository;


public interface OrderedItemsRepository extends CrudRepository<OrderedItems, Long> {
	
}

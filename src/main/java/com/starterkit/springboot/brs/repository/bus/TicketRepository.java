package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.Ticket;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface TicketRepository extends CrudRepository<Ticket, Long> {
}

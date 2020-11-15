package com.company.Composite.Tests;

import com.company.Composite.Client;
import com.company.Composite.CompositeService;
import com.company.Composite.OrderingService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositeTest {

    @Test
    public void testClient() {
        CompositeService compositeService = new CompositeService();
        OrderingService orderingService = new OrderingService();
        Client client = new Client();
        client.setCompositeServices(compositeService);
        assertEquals(orderingService.getClass(), CompositeService.class);
        assertEquals(client.getClass(), Client.class);
        assertEquals(client.getCompositeServices(), orderingService);
    }
}
package org.example.service;

import org.example.Dao;
import org.example.service.Service;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {
//    Khoi tao 1 mock Dao
    @Mock
    private Dao dao;

//    Khoi tao 1 injectMockservice
    @InjectMocks
    private Service service;

    /**
    @Test
    public void shouldReturnNullIfInputNull(){
        assertNull(service.save(null));
    }
    */
}

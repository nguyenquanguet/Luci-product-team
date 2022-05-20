package org.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class TestService {
    @Mock
    private Dao dao;

    @InjectMocks
    private Service service;

    @org.junit.jupiter.api.Test
    void shouldReturnNullIfInputNull() {
        assertNull(service.save(null));
    }

    @Test
    void shouldReturnSuccessIfDaoSaveSuccessAndInputNotNull(){
        when(dao.save(any())).thenReturn("1");
        assertEquals("1",service.save(new Service.UnvalidatedCreateUserContext()).getId());
    }

    @Test
    void shouldReturnNullIfDaoThrowException(){
        when(dao.save(any())).thenThrow(new RuntimeException());
        assertNull(service.save(new Service.UnvalidatedCreateUserContext()).getId());
    }
}
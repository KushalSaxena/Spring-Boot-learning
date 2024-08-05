package com.edigest.myFirstProject.service;

import com.edigest.myFirstProject.entity.User;
import com.edigest.myFirstProject.respository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Disabled
    @Test
    public void testFindByUserName(){
        User user = userRepository.findByUserName("Ram");
        assertTrue(!user.getJournalEntries().isEmpty());
    }

    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,3,4",
            "2,3,5"
    })
    public void test(int a, int b, int expected){
        assertEquals(expected,a+b);
    }
}

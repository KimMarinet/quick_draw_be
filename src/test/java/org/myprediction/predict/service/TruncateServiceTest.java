package org.myprediction.predict.service;

import org.junit.jupiter.api.Test;
import org.myprediction.predict.services.TruncateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TruncateServiceTest {

    @Autowired
    private TruncateService service;

    @Test
    void Test(){
        service.process();
    }
}

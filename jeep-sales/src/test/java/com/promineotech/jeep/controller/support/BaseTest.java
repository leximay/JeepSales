/**
 * 
 */
package com.promineotech.jeep.controller.support;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import com.promineotech.jeep.entity.Jeep;
import lombok.Getter;


public class BaseTest {
  @LocalServerPort
  private int serverPort;
  
  @Autowired
  @Getter
  private TestRestTemplate restTemplate;
  
  protected String getBaseUri() {
    return String.format("http://localhost:%d/jeeps", serverPort);
  }

}

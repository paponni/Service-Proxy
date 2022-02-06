package com.firsttest.gateway;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackMethodController {

    @RequestMapping("/transfer")
    public String transferServiceFallBackMethod(){
        return "Transfer service is taking too long . Retry later.";
    }

    @RequestMapping("/emission")
    public String emissionServiceFallBackMethod(){
        return "Transfer service is taking too long . Retry later.";
    }

    @RequestMapping("/client")
    public String clientServiceFallBackMethod(){
        return "Client service is taking too long . Retry later.";
    }

    @RequestMapping("/notification")
    public String notificationServiceFallBackMethod(){
        return "Notification service is taking too long . Retry later.";
    }

    @RequestMapping("/backoffice")
    public String backofficeServiceFallBackMethod(){
        return "Backoffice service is taking too long . Retry later.";
    }

    @RequestMapping("/agent")
    public String agentServiceFallBackMethod(){
        return "Agent service is taking too long . Retry later.";
    }
}

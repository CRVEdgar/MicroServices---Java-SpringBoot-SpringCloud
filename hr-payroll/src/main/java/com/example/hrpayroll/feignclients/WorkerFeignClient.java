package com.example.hrpayroll.feignclients;

//import com.example.hrpayroll.config.AppConfig;
import com.example.hrpayroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//@Component
//@FeignClient(name = "hr-worker", url = "http://localhost:8001/workers")
@FeignClient(value = "worker", url = "http://localhost:8001/workers")
public interface WorkerFeignClient {

//    @GetMapping(value = "/{id}")
//    Worker findByid(@PathVariable Long id);

    //@RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @GetMapping(value = "/{id}")
    Worker findByid(@PathVariable("id") Long id);
}

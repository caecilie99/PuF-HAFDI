package com.hafdiserver.restcontroller;

import com.hafdiserver.dao.HafdiDao;
import com.hafdiserver.model.Schiffsname;
import com.hafdiserver.model.Status;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Birgit on 31.10.2016.
 */

@RestController
public class HafdiRestController {

    private static final String greeting = "ich bin ein %s";

    @RequestMapping(path="/show", method = RequestMethod.GET)
    public List<Status> hello(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        HafdiDao dao = (HafdiDao) ctx.getBean("mydao");
        return dao.selectStatusAll();
    }

}

package dev.be.springlogback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {

    public static final Logger log = LoggerFactory.getLogger("SQL_LOG");

    @GetMapping("/query")
    public String query() {

        log.trace("log --> TRACE");
        log.debug("log --> DEBUG");
        log.info("log --> INFO");
        log.warn("log --> WARN");
        log.error("log --> ERROR");

        if (true) {
            throw new RuntimeException();
        }

        return "Query";
    }
}

package com.ranasoftcraft.org.ai.mcp.product.roadmap.entry;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import org.springframework.ai.mcp.annotation.context.McpSyncRequestContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("/api")
public class DefaultRestController {

    @GetMapping ("/default")
    public ResponseEntity<Map<String, Object>> hello(McpSyncRequestContext context) throws Exception {

        return ResponseEntity.ok(Collections.singletonMap("name", Arrays.asList("I am khan", "I am not khan")));
    }
}

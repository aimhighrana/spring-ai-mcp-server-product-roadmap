package com.ranasoftcraft.org.ai.mcp.product.roadmap.components;

import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.ai.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Service;

@Service 
public class TodoItemTool {

    @McpTool (name = "getPersonalDetails", description = "Get the personal detail about me , please pass the question as in input")
    public String name(@McpToolParam (description = "An input param , please pass the question") final String input) {
        return String.format("Hi , I am Sandeep , %s", input);
    }
}

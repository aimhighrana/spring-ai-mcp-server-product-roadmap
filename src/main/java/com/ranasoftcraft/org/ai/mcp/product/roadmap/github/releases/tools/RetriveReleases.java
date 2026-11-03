package com.ranasoftcraft.org.ai.mcp.product.roadmap.github.releases.tools;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.stereotype.Service;

import com.ranasoftcraft.org.ai.mcp.product.roadmap.github.releases.dto.GithubReleases;

@Service 
public class RetriveReleases {

    @McpTool (description = "Retrive 'ranasoftcraft' related project release details. Along with dates")
    public List<GithubReleases> releases() throws InterruptedException {
        return Arrays.asList(
            new GithubReleases("1", "beta", null, LocalDateTime.now(), LocalDateTime.now().plusHours(1)),
            new GithubReleases("2", "production", null, LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(1).plusHours(1))
        );
    }
}

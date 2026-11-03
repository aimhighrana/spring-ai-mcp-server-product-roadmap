package com.ranasoftcraft.org.ai.mcp.product.roadmap.github.releases.dto;

import java.time.LocalDateTime;

public record GithubReleases(String id , String name , String description, LocalDateTime start, LocalDateTime end) {

}

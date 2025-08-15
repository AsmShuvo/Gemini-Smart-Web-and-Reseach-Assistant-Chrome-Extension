package com.research.assistant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

//DTO (Data Transfer Object)
@Data
@JsonIgnoreProperties(ignoreUnknown = true) //If the incoming JSON has fields that are not present in this Java class, just ignore them instead of throwing err.
public class GeminiResponse {
    private List<Candidate> candidates;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Candidate{
        private Content content;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Content{
        private List<Part> parts;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Part{
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;
    }
}

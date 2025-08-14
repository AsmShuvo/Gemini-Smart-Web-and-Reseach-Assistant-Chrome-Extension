package com.research.assistant;

import java.util.Map;

public class ResearchService {
    public String processContent(ReseachRequest request) {
    //     Build the prompt
        String prompt = buildPrompt(request);
    //     query the AI model API
        Map<String, Object> requestBody = Map.of(
                "contents", new Object[]{
                        Map.of("parts", new Object[]{
                                Map.of("text", prompt)
                        })
                }
        );

    //     Parse the response
    //     return response

    }

    private String buildPrompt(ReseachRequest request){
        StringBuilder prompt = new StringBuilder();
        switch (request.getOperation()){
            case "Summerize":
                prompt.append("Provide a clear and concise summery of the following text in a few sentences:\n\n");
                break;
            case "suggest":
                prompt.append("Based on the following content: suggest related topics and further reading. Format the response with clear headings and bullet points\n\n");
                break;
            default:
                throw new IllegalArgumentException("Unknown Operation: "+ request.getOperation());
        }
        prompt.append(request.getContent());
        return prompt.toString();
    }
}

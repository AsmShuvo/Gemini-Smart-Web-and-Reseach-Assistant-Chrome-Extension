package com.research.assistant;

public class ResearchService {
    public String processContent(ReseachRequest request) {
    //     query the AI model with prompt and get the response and retrun as String
    //     Build the prompt
    //     query the AI model API
    //     Parse the response
    //     return response

    }

    private String buildPromt(ReseachRequest request){
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

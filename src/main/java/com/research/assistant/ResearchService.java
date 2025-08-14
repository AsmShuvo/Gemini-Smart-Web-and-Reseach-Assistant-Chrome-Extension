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
                prompt.append("")
        }
    }
}

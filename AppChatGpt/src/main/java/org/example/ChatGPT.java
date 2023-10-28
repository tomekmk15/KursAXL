package org.example;


import com.theokanning.openai.completion.CompletionChoice;
import com.theokanning.openai.completion.chat.ChatCompletionChoice;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.service.OpenAiService;

import java.util.List;

public class ChatGPT {
    OpenAiService service;

    public ChatGPT() {
        service = new OpenAiService("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");
    }

    public String getBreakfastIdeas(List<String> products) {
        String allProducts = String.join(", ", products);
        String question = "What are three ideas for breakfast with these products: " + allProducts + ". What can eat for breakfast?";
        return askChatGPT(question);
    }
    public String getDinnerIdea(List<String> products) {
        String allProducts = String.join(", ", products);
        String question = "What are three ideas for  dinner with these products: " + allProducts + ". What can eat for breakfast?";
        return askChatGPT(question);
    }

    private String askChatGPT(String question) {

            ChatCompletionRequest completionRequest = ChatCompletionRequest.builder()
                    .messages(List.of(new ChatMessage("user", question)))
                    .model("gpt-3.5-turbo")
                    .build();
            List<ChatCompletionChoice> choices = service.createChatCompletion(completionRequest).getChoices();

            StringBuilder stringBuilder = new StringBuilder();

            choices.stream ()
                    .map (ChatCompletionChoice::getMessage)
                    .map (ChatMessage::getContent)
                    .forEach(stringBuilder::append);
            return stringBuilder.toString();



        }
    }






























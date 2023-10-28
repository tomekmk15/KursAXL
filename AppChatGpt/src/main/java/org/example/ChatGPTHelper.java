package org.example;

import com.theokanning.openai.completion.chat.ChatCompletionChoice;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.service.OpenAiService;

import java.time.Duration;
import java.util.List;

public class ChatGPTHelper {
    OpenAiService service;

    public ChatGPTHelper() {
        service = new OpenAiService("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", Duration.ofSeconds(30));

    }

    public String getBreakfastIdeas(List<String> products) {
        String allProducts = String.join(", ", products);
        String question = "What are three ideas for breakfast with these products: " + allProducts + ". What can eat for breakfast?";


        ChatCompletionRequest completionRequest = ChatCompletionRequest.builder()
                .messages(List.of(new ChatMessage("user", question)))
                .model("gpt-3.5-turbo")
                .build();


        List<ChatCompletionChoice> choices = service.createChatCompletion(completionRequest).getChoices();

        StringBuilder stringBuilder = new StringBuilder();

        choices.stream()
                .map(ChatCompletionChoice::getMessage)
                .map(ChatMessage::getContent)
                .forEach(stringBuilder::append);
        return stringBuilder.toString();


    }
}




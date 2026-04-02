package spring_test.core.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;

import spring_test.core.utils.ResponseDataMessage;
import spring_test.core.body.UserBody;
import spring_test.core.dto.ExternalDataDTO;
import spring_test.core.model.EnrichedUser;
import spring_test.core.service.UserService;

import java.util.List;

@RestController 
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) 
    {
        this.userService = userService;
    }

    @Value("${external.api.url}")
    private String externalUrl;
    
    @GetMapping("/fetch-external")
    ResponseEntity<ResponseDataMessage<List<ExternalDataDTO>>> getExternalData() 
    {
        try {
            WebClient client = WebClient.create();

            List<ExternalDataDTO> externalData = client.get()
                .uri(this.externalUrl)
                .retrieve()
                .bodyToFlux(ExternalDataDTO.class)
                .collectList()
                .block();

            ResponseDataMessage<List<ExternalDataDTO>> response = ResponseDataMessage.<List<ExternalDataDTO>>builder()
                .code(200)
                .message("Success")
                .data(externalData)
                .build();

            return ResponseEntity.ok(response);

        }catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("/users")
    public ResponseEntity<ResponseDataMessage<String>> insertUser(@RequestBody UserBody userBody) 
    {

        String department = userBody.getDepartment();
        
        boolean isValidEmail = userService.validateEmail(userBody.getEmail());


        if(department == "" || department == null || !isValidEmail) {
            return ResponseEntity.status(400).build();
        }

        try {

            EnrichedUser enrichedUser = EnrichedUser.builder()
                .name(userBody.getName())
                .email(userBody.getEmail())
                .department(userBody.getDepartment())
                .lastUpdated(userBody.getLastUpdated())
                .build();

            userService.insertUser(enrichedUser);

            ResponseDataMessage<String> response = ResponseDataMessage.<String>builder()
                .code(200)
                .message("Success")
                .data("Successful Transaction")
                .build();

            return ResponseEntity.ok(response);

        }catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/users")
    public ResponseEntity<ResponseDataMessage<List<EnrichedUser>>> getEnrichedUsers() 
    {
        try {
            List<EnrichedUser> enrichedUsers = userService.getUsers();

            ResponseDataMessage<List<EnrichedUser>> response = ResponseDataMessage.<List<EnrichedUser>>builder()
                .code(200)
                .message("Success")
                .data(enrichedUsers)
                .build();

            return ResponseEntity.ok(response);

        }catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}

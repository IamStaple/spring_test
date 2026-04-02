package spring_test.core.service;

import org.springframework.stereotype.Service;

import spring_test.core.model.EnrichedUser;
import spring_test.core.repository.UserRepository;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

@Service
public class UserService {

    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository) 
    {
        this.userRepository = userRepository;
    }

    @Transactional
    public void insertUser(EnrichedUser enrichedUser) 
    {
        userRepository.save(enrichedUser);
    }

    @Transactional
    public List<EnrichedUser> getUsers() 
    {
        return userRepository.getEnrichedUsers();
    }

    public boolean validateEmail(String email) 
    {
        String regex = "^[A-Za-z0-9._%-]+@.{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}

package user.management.Servise;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import user.management.Entity.UserEntity;
import user.management.Repository.UserRepository;

@Service
public class UserServiceImpl implements  UserService {

      private final UserRepository userRepository;

      public UserServiceImpl(UserRepository userRepository) {
           this.userRepository = userRepository;
      }



    @Override
    public String RegisterUser(UserEntity user) {
          if(userRepository.existsByEmail(user.getEmail())) {
               throw  new ResponseStatusException(HttpStatus.BAD_REQUEST,"email already exists");
          }
          if(userRepository.existsByUserName(user.getUserName())) {
               throw  new ResponseStatusException(HttpStatus.BAD_REQUEST,"username is already exists");
          }
          //Save The database
        userRepository.save(user);
          return "User Registered Successfully!";
    }
}

package nhom12.uth.ccm.mapper;

import javax.annotation.processing.Generated;
import nhom12.uth.ccm.dto.request.CreateUserRequest;
import nhom12.uth.ccm.dto.request.UpdateUserRequest;
import nhom12.uth.ccm.dto.response.UserResponse;
import nhom12.uth.ccm.model.User;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-24T02:34:10+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(CreateUserRequest createUserRequestDTO) {
        if ( createUserRequestDTO == null ) {
            return null;
        }

        User user = new User();

        user.setUserRole( createUserRequestDTO.getRole() );
        user.setPasswordHash( createUserRequestDTO.getPassword() );
        user.setEmail( createUserRequestDTO.getEmail() );
        user.setFirstName( createUserRequestDTO.getFirstName() );
        user.setLastName( createUserRequestDTO.getLastName() );
        user.setPhoneNumber( createUserRequestDTO.getPhoneNumber() );
        user.setStatus( createUserRequestDTO.getStatus() );

        return user;
    }

    @Override
    public void updateUser(User user, UpdateUserRequest updateUserRequestDTO) {
        if ( updateUserRequestDTO == null ) {
            return;
        }

        user.setUserRole( updateUserRequestDTO.getRole() );
        user.setFirstName( updateUserRequestDTO.getFirstName() );
        user.setLastName( updateUserRequestDTO.getLastName() );
    }

    @Override
    public UserResponse toUserResponeDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setRole( user.getUserRole() );
        userResponse.setUserId( user.getUserId() );
        userResponse.setPassword( user.getPassword() );
        userResponse.setEmail( user.getEmail() );
        userResponse.setPhoneNumber( user.getPhoneNumber() );
        userResponse.setFirstName( user.getFirstName() );
        userResponse.setLastName( user.getLastName() );
        userResponse.setStatus( user.getStatus() );

        return userResponse;
    }
}

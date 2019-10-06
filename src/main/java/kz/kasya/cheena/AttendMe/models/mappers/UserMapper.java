package kz.kasya.cheena.AttendMe.models.mappers;

import kz.kasya.cheena.AttendMe.models.dtos.UserDto;
import kz.kasya.cheena.AttendMe.models.entities.User;
import kz.kasya.cheena.AttendMe.shared.utils.mappers.AbstractModelMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper extends AbstractModelMapper<User, UserDto> {

    private ModelMapper modelMapper;
    private RoleMapper roleMapper;

    @Autowired
    public UserMapper(ModelMapper modelMapper,
                      RoleMapper roleMapper) {
        this.modelMapper = modelMapper;
        this.roleMapper = roleMapper;
    }

    @Override
    public UserDto toDto(User user) {
        UserDto userDto = modelMapper.map(user, UserDto.class);
        if (user.getRole() != null) {
            userDto.setRole(roleMapper.toDto(user.getRole()));
        }
        return userDto;
    }

    @Override
    public User toEntity(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        if (userDto.getRole() != null) {
            user.setRole(roleMapper.toEntity(userDto.getRole()));
        }
        return user;
    }

    @Override
    public List<UserDto> toDtoList(List<User> users) {
        return users.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<User> toEntityList(List<UserDto> userDtos) {
        return userDtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}

package kz.kasya.cheena.AttendMe.models.dtos;

import kz.kasya.cheena.AttendMe.models.dtos.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends BaseDto {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String login;

    private String password;

    private RoleDto role;

}

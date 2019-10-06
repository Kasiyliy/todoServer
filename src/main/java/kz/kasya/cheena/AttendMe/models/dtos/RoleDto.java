package kz.kasya.cheena.AttendMe.models.dtos;

import io.swagger.annotations.ApiModelProperty;
import kz.kasya.cheena.AttendMe.models.dtos.base.BaseDto;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class RoleDto extends BaseDto {

    @ApiModelProperty(notes = "Наименование", readOnly = true)
    private String name;

}

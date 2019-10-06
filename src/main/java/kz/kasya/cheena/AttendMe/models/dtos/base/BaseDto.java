package kz.kasya.cheena.AttendMe.models.dtos.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Assylkhan
 * on 10.04.2019
 * @project logistic_server
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseDto {


    @ApiModelProperty(notes = "Уникальный идентификатор", readOnly = true)
    private Long id;

    @ApiModelProperty(notes = "Момент создания элемента", readOnly = true)
    private Date createdAt;

    @ApiModelProperty(notes = "Момент обновления элемента", readOnly = true)
    private Date updatedAt;

    @ApiModelProperty(notes = "Момент удаления элемента", readOnly = true)
    private Date deletedAt;


}

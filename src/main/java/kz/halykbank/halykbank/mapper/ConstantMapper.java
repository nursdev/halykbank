package kz.halykbank.halykbank.mapper;

import kz.halykbank.halykbank.dto.ConstantDTO;
import kz.halykbank.halykbank.model.Constant;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

public class ConstantMapper {

    public static ConstantDTO toDTO(Constant constant) {
        ConstantDTO constantDTO = new ConstantDTO();
        constantDTO.setId(constant.getId());
        constantDTO.setName(constant.getName());
        constantDTO.setValue(constant.getValue());

        // Assuming you have an ItemConverter to convert Item to ItemDTO
        constantDTO.setItemDTO(ItemMapper.toDTO(constant.getItem()));

        return constantDTO;
    }

    public static Constant toEntity(ConstantDTO constantDTO) {
        Constant constant = new Constant();
        constant.setId(constantDTO.getId());
        constant.setName(constantDTO.getName());
        constant.setValue(constantDTO.getValue());

        // Assuming you have an ItemConverter to convert ItemDTO to Item
        constant.setItem(ItemMapper.toEntity(constantDTO.getItemDTO()));

        return constant;
    }

    public static List<ConstantDTO> toDTOList(List<Constant> constants) {
        return constants.stream()
                .map(ConstantMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static List<Constant> toEntityList(List<ConstantDTO> constantDTOs) {
        return constantDTOs.stream()
                .map(ConstantMapper::toEntity)
                .collect(Collectors.toList());
    }

}

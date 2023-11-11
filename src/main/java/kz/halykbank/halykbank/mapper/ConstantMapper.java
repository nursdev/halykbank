package kz.halykbank.halykbank.mapper;

import kz.halykbank.halykbank.dto.ConstantDTO;
import kz.halykbank.halykbank.model.Constant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ConstantMapper {

    private final ItemMapper itemMapper;

    public ConstantDTO toDTO(Constant constant) {
        ConstantDTO constantDTO = new ConstantDTO();
        constantDTO.setId(constant.getId());
        constantDTO.setName(constant.getName());
        constantDTO.setValue(constant.getValue());
        constantDTO.setItemDTO(itemMapper.toDTO(constant.getItem()));

        return constantDTO;
    }

    public Constant toEntity(ConstantDTO constantDTO) {
        Constant constant = new Constant();
        constant.setId(constant.getId());
        constant.setName(constantDTO.getName());
        constant.setValue(constantDTO.getValue());
        constant.setItem(itemMapper.toModel(constantDTO.getItemDTO()));

        return constant;
    }

    public List<ConstantDTO> toDTOList(List<Constant> constants) {
        List<ConstantDTO> constantDTOS = new ArrayList<>();
        for (Constant constant : constants){
            constantDTOS.add(toDTO(constant));
        }

        return constantDTOS;
    }
}

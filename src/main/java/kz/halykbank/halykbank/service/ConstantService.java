package kz.halykbank.halykbank.service;

import kz.halykbank.halykbank.dto.ConstantDTO;
import kz.halykbank.halykbank.mapper.ConstantMapper;
import kz.halykbank.halykbank.model.Constant;
import kz.halykbank.halykbank.repository.ConstantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ConstantService {

    private final ConstantRepository constantRepository;
    private final ConstantMapper constantMapper;

    public List<ConstantDTO> getConstantDTOList() {
        return ConstantMapper.toDTOList(constantRepository.findAll());
    }

    


    public List<ConstantDTO> getList() {
        return constantMapper.toDTOList(constantRepository.findAll());
    }
}

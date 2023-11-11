package kz.halykbank.halykbank.service;

import kz.halykbank.halykbank.dto.ItemDTO;
import kz.halykbank.halykbank.mapper.ItemMapper;
import kz.halykbank.halykbank.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    public List<ItemDTO> getList() {
        return itemMapper.toDtoList(itemRepository.findAll());
    }
}

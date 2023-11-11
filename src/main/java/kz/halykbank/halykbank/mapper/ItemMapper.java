package kz.halykbank.halykbank.mapper;

import ch.qos.logback.core.read.ListAppender;
import kz.halykbank.halykbank.dto.ItemDTO;
import kz.halykbank.halykbank.model.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ItemMapper {

    public ItemDTO toDTO(Item item) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(itemDTO.getId());
        itemDTO.setName(item.getName());
        itemDTO.setPrice(item.getPrice());
        itemDTO.setOrganizationDTO(itemDTO.getOrganizationDTO());
        return itemDTO;
    }

    public Item toModel(ItemDTO itemDTO) {
        Item item = new Item();
        item.setName(itemDTO.getName());
        item.setId(itemDTO.getId());
        item.setPrice(itemDTO.getPrice());
        item.setOrganization(item.getOrganization());

        return item;

    }

    public List<ItemDTO> toDtoList(List<Item> items) {
        List<ItemDTO> itemDTOS = new ArrayList<>();
        for (Item item : items){
            itemDTOS.add(toDTO(item));
        }

        return itemDTOS;
    }

    public List<Item> toEntityList(List<ItemDTO> itemsDTOs) {
        List<Item> items = new ArrayList<>();
        for (ItemDTO itemDTO : itemsDTOs) {
            items.add(toModel(itemDTO));
        }

        return items;
    }
}

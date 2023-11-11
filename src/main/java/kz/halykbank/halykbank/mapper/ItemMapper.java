package kz.halykbank.halykbank.mapper;

import kz.halykbank.halykbank.dto.ItemDTO;
import kz.halykbank.halykbank.model.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
public class ItemMapper {


    public static ItemDTO toDTO(Item item) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(item.getId());
        itemDTO.setName(item.getName());
        itemDTO.setPrice(item.getPrice());

        // Assuming you have an OrganizationConverter to convert Organization to OrganizationDTO
        itemDTO.setOrganizationDTO(OrganizationMapper.toDTO(item.getOrganization()));

        return itemDTO;
    }

    public static Item toEntity(ItemDTO itemDTO) {
        Item item = new Item();
        item.setId(itemDTO.getId());
        item.setName(itemDTO.getName());
        item.setPrice(itemDTO.getPrice());

        // Assuming you have an OrganizationConverter to convert OrganizationDTO to Organization
        item.setOrganization(OrganizationMapper.toEntity(itemDTO.getOrganizationDTO()));

        return item;
    }

    public static List<ItemDTO> toDTOList(List<Item> items) {
        return items.stream()
                .map(ItemMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static List<Item> toEntityList(List<ItemDTO> itemDTOs) {
        return itemDTOs.stream()
                .map(ItemMapper::toEntity)
                .collect(Collectors.toList());
    }

}

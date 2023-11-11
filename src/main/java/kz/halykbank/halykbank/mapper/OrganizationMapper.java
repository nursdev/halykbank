package kz.halykbank.halykbank.mapper;

import kz.halykbank.halykbank.dto.OrganizationDTO;
import kz.halykbank.halykbank.model.Organization;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

public class OrganizationMapper {

    public static OrganizationDTO toDTO(Organization organization) {
        OrganizationDTO organizationDTO = new OrganizationDTO();
        organizationDTO.setId(organization.getId());
        organizationDTO.setName(organization.getName());
        organizationDTO.setAddress(organization.getAddress());

        // Assuming you have a UserConverter to convert User to UserDTO
        organizationDTO.setUserDTO(UserMapper.toDTO(organization.getUser()));

        // Assuming you have an ItemConverter to convert List<Item> to List<ItemDTO>
        organizationDTO.setItemsDTOs(ItemMapper.toDTOList(organization.getItems()));

        return organizationDTO;
    }

    public static Organization toEntity(OrganizationDTO organizationDTO) {
        Organization organization = new Organization();
        organization.setId(organizationDTO.getId());
        organization.setName(organizationDTO.getName());
        organization.setAddress(organizationDTO.getAddress());

        // Assuming you have a UserConverter to convert UserDTO to User
        organization.setUser(UserMapper.toEntity(organizationDTO.getUserDTO()));

        // Assuming you have an ItemConverter to convert List<ItemDTO> to List<Item>
        organization.setItems(ItemMapper.toEntityList(organizationDTO.getItemsDTOs()));

        return organization;
    }

    public static List<OrganizationDTO> toDTOList(List<Organization> organizations) {
        return organizations.stream()
                .map(OrganizationMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static List<Organization> toEntityList(List<OrganizationDTO> organizationDTOs) {
        return organizationDTOs.stream()
                .map(OrganizationMapper::toEntity)
                .collect(Collectors.toList());
    }
}

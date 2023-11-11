package kz.halykbank.halykbank.mapper;

import kz.halykbank.halykbank.dto.OrganizationDTO;
import kz.halykbank.halykbank.model.Organization;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class OrganizationMapper {

    private final UserMapper userMapper;


    public OrganizationDTO toDTO(Organization organization) {
        OrganizationDTO organizationDTO = new OrganizationDTO();
        organizationDTO.setId(organization.getId());
        organizationDTO.setName(organization.getName());
        organizationDTO.setAddress(organization.getAddress());
        organizationDTO.setUserDTO(userMapper.toDTO(organization.getUser()));


        return organizationDTO;
    }

    public Organization toEntity(OrganizationDTO organizationDTO) {
        Organization organization = new Organization();
        organization.setId(organizationDTO.getId());
        organization.setName(organizationDTO.getName());
        organization.setAddress(organizationDTO.getAddress());
        organization.setUser(userMapper.toEntity(organizationDTO.getUserDTO()));


        return organization;
    }

    public List<OrganizationDTO> toDTOList(List<Organization> organizations) {
        List<OrganizationDTO> organizationDTOS = new ArrayList<>();
        for (Organization organization : organizations) {
            organizationDTOS.add(toDTO(organization));
        }
        return organizationDTOS;
    }

    public List<Organization> toEntityList(List<OrganizationDTO> organizationDTOs) {
        List<Organization> organizations = new ArrayList<>();

        for (OrganizationDTO organizationDTO : organizationDTOs) {
            organizations.add(toEntity(organizationDTO));
        }
        return organizations;
    }

}

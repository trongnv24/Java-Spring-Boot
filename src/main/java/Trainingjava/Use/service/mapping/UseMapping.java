package Trainingjava.Use.service.mapping;

import Trainingjava.Use.dto.request.UseRequest;
import Trainingjava.Use.dto.response.UseResponse;
import Trainingjava.Use.entity.UseEntity;

public class UseMapping {
    public static UseEntity convertDtoToEntity(UseRequest dto) {
        UseEntity entity = new UseEntity();
        entity.setName(dto.getName());
        entity.setPassword(dto.getPassword());
        entity.setLastname(dto.getLastname());
        entity.setCreatedDate(dto.getCreatedDate());
        return entity;
    }

    public static UseResponse converEntitytoUserReponse (UseEntity entity) {
        UseResponse dto = new UseResponse();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPassword(entity.getPassword());
        dto.setLastname(entity.getLastname());
        dto.setCreatedDate(entity.getCreatedDate());
        return dto;
    }

}

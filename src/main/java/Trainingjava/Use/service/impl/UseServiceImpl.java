package Trainingjava.Use.service.impl;

import Trainingjava.Use.dto.request.UseRequest;
import Trainingjava.Use.dto.response.UseResponse;
import Trainingjava.Use.entity.UseEntity;
import Trainingjava.Use.repository.UseRepository;
import Trainingjava.Use.service.UseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static Trainingjava.Use.service.mapping.UseMapping.converEntitytoUserReponse;
import static Trainingjava.Use.service.mapping.UseMapping.convertDtoToEntity;

@Service
@Slf4j
public class UseServiceImpl implements UseService {

    private final UseRepository useRepository;

    public UseServiceImpl(UseRepository useRepository) {
        this.useRepository = useRepository;
    }

    @Override
    public UseResponse create(UseRequest request) {
        log.info("=== Start create new Use ===");
        log.info("=== User request: {} ===", request);
        UseEntity useEntity = convertDtoToEntity(request);
        useEntity = useRepository.save(useEntity);
        UseResponse response = converEntitytoUserReponse(useEntity);
        log.info("=== Finish create new User, user id: {} ===", response.getId());

        return response;
    }
    @Override
    public UseResponse update(UseRequest request, String id) {
        log.info("=== Start update Use ===");
        log.info("=== User request: {},  id:{} ===", request, id);
        Optional<UseEntity> optionalUse = useRepository.findById(id);
        if (!optionalUse.isPresent()) {
            throw new RuntimeException();
        }
      UseEntity useEntity = optionalUse.get();
      useEntity.setName(request.getName());
      useEntity.setPassword(request.getPassword());
      useEntity.setLastname(request.getLastname());
      useEntity.setCreatedDate(request.getCreatedDate());
      useEntity = useRepository.save(useEntity);
      UseResponse response = converEntitytoUserReponse(useEntity);
      log.info(("=== Finish update user, user id : ===="),response.getId());
      return response;
    }
    @Override
    public UseResponse getById (String id){
        log.info("=== Start create Use ===");
        log.info("=== User id: {} ===", id);
        Optional<UseEntity> optionalUse = useRepository.findById(id);
        if (!optionalUse.isPresent()) {
            throw new RuntimeException();
        }
        UseEntity useEntity = optionalUse.get();
        UseResponse response = converEntitytoUserReponse(useEntity);
        log.info("=== Finish Use new book, book id: {} ===", response.getId());
        return response;
    }
}

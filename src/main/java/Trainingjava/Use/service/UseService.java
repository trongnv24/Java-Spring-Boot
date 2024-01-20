package Trainingjava.Use.service;

import Trainingjava.Use.dto.request.UseRequest;
import Trainingjava.Use.dto.response.UseResponse;

public interface UseService {
    UseResponse create(UseRequest request);

    UseResponse update(UseRequest request, String id);

    UseResponse getById(String id);
}

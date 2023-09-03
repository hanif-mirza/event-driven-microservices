package learn.hanif.microservices.event.driven.elastic.query.service.business;

import learn.hanif.microservices.event.driven.elastic.query.service.dataaccess.entity.UserPermission;

import java.util.List;
import java.util.Optional;

public interface QueryUserService {

    Optional<List<UserPermission>> findAllPermissionsByUsername(String username);
}

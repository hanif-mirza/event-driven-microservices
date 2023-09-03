package learn.hanif.microservices.event.driven.elastic.query.service.business.impl;

import learn.hanif.microservices.event.driven.elastic.query.service.business.QueryUserService;
import learn.hanif.microservices.event.driven.elastic.query.service.dataaccess.entity.UserPermission;
import learn.hanif.microservices.event.driven.elastic.query.service.dataaccess.repository.UserPermissionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TwitterQueryUserService implements QueryUserService {

    private static final Logger LOG = LoggerFactory.getLogger(TwitterQueryUserService.class);


    private final UserPermissionRepository userPermissionRepository;

    public TwitterQueryUserService(UserPermissionRepository permissionRepository) {
        this.userPermissionRepository = permissionRepository;
    }

    @Override
    public Optional<List<UserPermission>> findAllPermissionsByUsername(String username) {
        LOG.info("Finding permissions by username {}", username);
        return userPermissionRepository.findPermissionsByUsername(username);
    }
}

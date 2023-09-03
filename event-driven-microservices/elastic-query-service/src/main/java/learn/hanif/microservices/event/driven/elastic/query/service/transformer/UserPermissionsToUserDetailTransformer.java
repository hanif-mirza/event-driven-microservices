package learn.hanif.microservices.event.driven.elastic.query.service.transformer;

import learn.hanif.microservices.event.driven.elastic.query.service.dataaccess.entity.UserPermission;
import learn.hanif.microservices.event.driven.elastic.query.service.security.PermissionType;
import learn.hanif.microservices.event.driven.elastic.query.service.security.TwitterQueryUser;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserPermissionsToUserDetailTransformer {

    public TwitterQueryUser getUserDetails(List<UserPermission> userPermissions) {
        return TwitterQueryUser.builder()
                .username(userPermissions.get(0).getUsername())
                .permissions(userPermissions.stream()
                        .collect(Collectors.toMap(
                                UserPermission::getDocumentId,
                                permission -> PermissionType.valueOf(permission.getPermissionType()))))
                .build();
    }
}

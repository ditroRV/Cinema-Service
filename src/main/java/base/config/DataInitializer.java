package base.config;

import java.util.Set;
import javax.annotation.PostConstruct;
import base.model.Role;
import base.model.RoleName;
import base.model.User;
import base.service.RoleService;
import base.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService,
                           UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(RoleName.USER);
        roleService.add(userRole);
        User user = new User();
        user.setEmail("admin@com.ua");
        user.setPassword("pass1234");
        user.setRoles(Set.of(adminRole));
        userService.add(user);
        User adminUser = new User();
        adminUser.setEmail("user@com.ua");
        adminUser.setPassword("pass1234");
        adminUser.setRoles(Set.of(userRole));
        userService.add(adminUser);
    }
}

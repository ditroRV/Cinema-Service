package base.service;

import base.model.Role;

public interface RoleService {
    void add(Role role);

    Role getRoleByName(String roleName);
}

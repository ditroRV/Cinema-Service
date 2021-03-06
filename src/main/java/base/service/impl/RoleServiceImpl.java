package base.service.impl;

import base.dao.RoleDao;
import base.exception.DataProcessingException;
import base.model.Role;
import base.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleDao.getRoleByName(roleName).orElseThrow(() ->
                new DataProcessingException("Role with name " + roleName + " not found"));
    }
}

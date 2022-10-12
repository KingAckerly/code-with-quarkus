package org.acme.service;

import org.acme.entity.QuarkusTestEntity;
import org.acme.mapper.QuarkusMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class QuarkusService {
    @Inject
    private QuarkusMapper quarkusMapper;

    public List<QuarkusTestEntity> listQuarkusTests() {
        return quarkusMapper.selectList(null);
    }
}

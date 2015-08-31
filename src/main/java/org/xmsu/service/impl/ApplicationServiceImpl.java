package org.xmsu.service.impl;

import org.xmsu.components.impl.MotorArduino;
import org.xmsu.service.ApplicationService;

import javax.inject.Inject;

/**
 * Created by martin on 28/08/15.
 */
public class ApplicationServiceImpl implements ApplicationService {

    @Inject
    private MotorArduino motorArduino;

    @Override
    public MotorArduino getMotorArduino() {
        return motorArduino;
    }
}

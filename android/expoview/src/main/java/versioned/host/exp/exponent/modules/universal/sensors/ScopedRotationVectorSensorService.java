package versioned.host.exp.exponent.modules.universal.sensors;

import java.util.Collections;
import java.util.List;

import expo.core.interfaces.InternalModule;
import expo.interfaces.sensors.services.RotationVectorSensorService;
import host.exp.exponent.kernel.ExperienceId;
import host.exp.exponent.kernel.services.sensors.SubscribableSensorKernelService;

public class ScopedRotationVectorSensorService extends BaseSensorService implements InternalModule, RotationVectorSensorService {
  public ScopedRotationVectorSensorService(ExperienceId experienceId) {
    super(experienceId);
  }

  @Override
  protected SubscribableSensorKernelService getSensorKernelService() {
    return getKernelServiceRegistry().getRotationVectorSensorKernelService();
  }

  @Override
  public List<Class> getExportedInterfaces() {
    return Collections.<Class>singletonList(RotationVectorSensorService.class);
  }
}


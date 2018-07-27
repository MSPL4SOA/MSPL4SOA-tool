package SP_helicopter1.state;

import javax.ejb.Stateless;
import javax.inject.Named;

import org.jboss.annotation.ejb.cache.simple.CacheConfig;

import SP_helicopter1.util.StateBase;

@Stateless
@CacheConfig(maxSize = 100000, idleTimeoutSeconds = 300, removalTimeoutSeconds = 0)
@Named("State_ServiceName_2_CapabilityName_2_4")
public class State_ServiceName_2_CapabilityName_2_4 extends StateBase {

}

package SP_aircraftcarrier1.state;

import javax.ejb.Stateless;
import javax.inject.Named;

import org.jboss.annotation.ejb.cache.simple.CacheConfig;

import SP_aircraftcarrier1.util.StateBase;

@Stateless
@CacheConfig(maxSize = 100000, idleTimeoutSeconds = 300, removalTimeoutSeconds = 0)
@Named("State_ServiceName_5_CapabilityName_5_5")
public class State_ServiceName_5_CapabilityName_5_5 extends StateBase {

}

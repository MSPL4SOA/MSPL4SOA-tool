package SP_submarine2.state;

import javax.ejb.Stateless;
import javax.inject.Named;

import org.jboss.annotation.ejb.cache.simple.CacheConfig;

import SP_submarine2.util.StateBase;

@Stateless
@CacheConfig(maxSize = 100000, idleTimeoutSeconds = 300, removalTimeoutSeconds = 0)
@Named("State_ServiceName_4_CapabilityName_4_2")
public class State_ServiceName_4_CapabilityName_4_2 extends StateBase {

}

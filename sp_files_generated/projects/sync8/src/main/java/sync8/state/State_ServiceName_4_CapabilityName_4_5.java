package sync8.state;

import javax.ejb.Stateless;
import javax.inject.Named;

import org.jboss.annotation.ejb.cache.simple.CacheConfig;

import sync8.util.StateBase;

@Stateless
@CacheConfig(maxSize = 100000, idleTimeoutSeconds = 300, removalTimeoutSeconds = 0)
@Named("State_ServiceName_4_CapabilityName_4_5")
public class State_ServiceName_4_CapabilityName_4_5 extends StateBase {

}

package sync8.state;

import javax.ejb.Stateless;
import javax.inject.Named;

import org.jboss.annotation.ejb.cache.simple.CacheConfig;

import sync8.util.StateBase;

@Stateless
@CacheConfig(maxSize = 100000, idleTimeoutSeconds = 300, removalTimeoutSeconds = 0)
@Named("State_ServiceName_1_CapabilityName_1_1")
public class State_ServiceName_1_CapabilityName_1_1 extends StateBase {

}

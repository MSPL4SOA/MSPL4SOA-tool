package hidden1.state;

import javax.ejb.Stateless;
import javax.inject.Named;

import org.jboss.annotation.ejb.cache.simple.CacheConfig;

import hidden1.util.StateBase;

@Stateless
@CacheConfig (maxSize=100000, idleTimeoutSeconds=300, removalTimeoutSeconds=0)
@Named("State_null_CapabilityName_1_1")
public class State_null_CapabilityName_1_1 extends StateBase
{

}
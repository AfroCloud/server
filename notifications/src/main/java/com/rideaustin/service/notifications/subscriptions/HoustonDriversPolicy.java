package com.rideaustin.service.notifications.subscriptions;

import org.springframework.stereotype.Component;

import com.rideaustin.filter.ClientAgentCity;
import com.rideaustin.model.Token;
import com.rideaustin.model.enums.AvatarType;
import com.rideaustin.service.notifications.SubscriptionPolicy;

@Component
public class HoustonDriversPolicy implements SubscriptionPolicy {
  
  @Override
  public boolean shouldSubscribe(Token token) {
    return token.getAvatarType().equals(AvatarType.DRIVER) &&
      token.getAgent().equals(ClientAgentCity.HOUSTON);
  }
}

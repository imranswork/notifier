package com.sflpro.notifier.persistence.repositories.notification.push.sns;

import com.sflpro.notifier.persistence.repositories.notification.push.AbstractPushNotificationRecipientRepository;
import com.sflpro.notifier.db.entities.notification.push.sns.PushNotificationSnsRecipient;
import org.springframework.stereotype.Repository;

/**
 * User: Ruben Dilanyan
 * Company: SFL LLC
 * Date: 8/13/15
 * Time: 1:09 PM
 */
@Repository
public interface PushNotificationSnsRecipientRepository extends AbstractPushNotificationRecipientRepository<PushNotificationSnsRecipient> {
}

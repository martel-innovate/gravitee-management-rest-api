/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.management.repository.proxy;

import io.gravitee.repository.exceptions.TechnicalException;
import io.gravitee.repository.management.api.NotificationRepository;
import io.gravitee.repository.management.model.Notification;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author Nicolas GERAUD (nicolas.geraud at graviteesource.com)
 * @author GraviteeSource Team
 */
@Component
public class NotificationRepositoryProxy extends AbstractProxy<NotificationRepository> implements NotificationRepository {

    @Override
    public Optional<Notification> findById(String s) throws TechnicalException {
        return target.findById(s);
    }

    @Override
    public Notification create(Notification item) throws TechnicalException {
        return target.create(item);
    }

    @Override
    public Notification update(Notification item) throws TechnicalException {
        return target.update(item);
    }

    @Override
    public List<Notification> findByUsername(String username) throws TechnicalException {
        return target.findByUsername(username);
    }

    @Override
    public void delete(String s) throws TechnicalException {
        target.delete(s);
    }
}

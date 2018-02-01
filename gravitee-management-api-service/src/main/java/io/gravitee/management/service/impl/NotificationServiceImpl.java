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
package io.gravitee.management.service.impl;

import io.gravitee.management.service.NotificationService;
import io.gravitee.management.service.notification.Hook;
import io.gravitee.management.service.notification.HookScope;
import io.gravitee.management.service.notification.Hooks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author Nicolas GERAUD (nicolas.geraud at graviteesource.com)
 * @author GraviteeSource Team
 */
@Component
public class NotificationServiceImpl extends AbstractService implements NotificationService {

    private final Logger LOGGER = LoggerFactory.getLogger(NotificationServiceImpl.class);

    @Override
    public Collection<Hook> findHooksByScope(HookScope scope) {
        if (scope == null) {
            LOGGER.error("A scope must be specified");
            throw new IllegalArgumentException("A scope must be specified");
        }
        return Hooks.get(scope);
    }
}

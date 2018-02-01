/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.management.service.notification;

import java.util.*;

/**
 * @author Nicolas GERAUD (nicolas.geraud at graviteesource.com) 
 * @author GraviteeSource Team
 */
public class Hooks {
    private static Map<HookScope, Collection<Hook>> items = new HashMap<>();


    static {
        List<Hook> apiHooks = new ArrayList<>();
        // API Hooks
        apiHooks.add(new Hook(
                "APIKEY_REVOKED",
                "Triggered when an api-key is revoked.",
                HookScope.API));
        apiHooks.add(new Hook(
                "SUBSCRIPTION_ACCEPTED",
                "Triggered when a Subscription is accepted.",
                HookScope.API));
        items.put(HookScope.API, Collections.unmodifiableCollection(apiHooks));

        // APPLICATION Hooks
        List<Hook> applicationHooks = new ArrayList<>();
        apiHooks.add(new Hook(
                "SUBSCRIPTION_ACCEPTED",
                "Triggered when a Subscription is accepted.",
                HookScope.APPLICATION));
        items.put(HookScope.APPLICATION, Collections.unmodifiableCollection(applicationHooks));

        // PORTAL Hooks
        List<Hook> portalHooks = new ArrayList<>();
        apiHooks.add(new Hook(
                "USER_REGISTERED",
                "Triggered when a User is registered for the first time.",
                HookScope.PORTAL));
        items.put(HookScope.PORTAL, Collections.unmodifiableCollection(portalHooks));
    }

    public static Collection<Hook> get(HookScope scope) {
        return items.get(scope);
    }

}

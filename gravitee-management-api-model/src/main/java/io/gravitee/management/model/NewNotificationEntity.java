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
package io.gravitee.management.model;

import java.util.Objects;

/**
 * @author Nicolas GERAUD (nicolas.geraud at graviteesource.com)
 * @author GraviteeSource Team
 */
public class NewNotificationEntity {

    private String title;
    private String message;
    private String username;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewNotificationEntity)) return false;
        NewNotificationEntity that = (NewNotificationEntity) o;
        return Objects.equals(title, that.title)
                && Objects.equals(message, that.message)
                && Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, message, username);
    }

    @Override
    public String toString() {
        return "NewNotificationEntity{" +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}

/*
 * Copyright 2016 Victor Albertos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.rx_cache;

public class Mock {
    final private String message;

    public Mock(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public class InnerMock {
        final private String message;

        public InnerMock(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}

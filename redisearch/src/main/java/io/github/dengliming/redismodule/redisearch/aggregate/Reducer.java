/*
 * Copyright 2020 dengliming.
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

package io.github.dengliming.redismodule.redisearch.aggregate;

import java.util.List;

/**
 * @author dengliming
 */
public abstract class Reducer {

    private String alias;
    private final String field;

    public Reducer(String field) {
        this.field = field;
    }

    public final Reducer as(String alias) {
        this.alias = alias;
        return this;
    }

    public String getAlias() {
        return alias;
    }

    public String getField() {
        return field;
    }

    public abstract void build(List<Object> args);

}

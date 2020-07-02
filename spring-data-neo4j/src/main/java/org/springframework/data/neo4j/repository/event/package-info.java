/*
 * Copyright 2011-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Contains the infrastructure for the event system. The event system comes in two flavours: Events that are based
 * on Spring's application event system and callbacks that are based on Spring Data's callback system. Application
 * events can be configured to run asynchronously, which make them a bad fit in transactional workloads.
 * <p>
 * As a rule of thumb, use Entity callbacks for modifying entities before persisting and application events otherwise.
 * The best option however to react in a transactional way to changes of an entity is to implement
 * {@link org.springframework.data.domain.DomainEvents} on an aggregate root.
 *
 * @author Michael J. Simons
 * @since 1.0
 * @soundtrack Bon Jovi - Slippery When Wet
 */
@NonNullApi
package org.springframework.data.neo4j.repository.event;

import org.springframework.lang.NonNullApi;

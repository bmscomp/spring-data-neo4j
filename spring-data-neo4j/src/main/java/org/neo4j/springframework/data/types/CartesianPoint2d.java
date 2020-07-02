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
package org.neo4j.springframework.data.types;

import org.apiguardian.api.API;

/**
 * @author Michael J. Simons
 * @since 1.0
 */
@API(status = API.Status.STABLE, since = "1.0")
public final class CartesianPoint2d extends AbstractPoint {

    static final int SRID = 7203;

    CartesianPoint2d(Coordinate coordinate) {
        super(coordinate, SRID);
    }

    public CartesianPoint2d(double x, double y) {
        super(new Coordinate(x, y), SRID);
    }

    public double getX() {
        return coordinate.getX();
    }

    public double getY() {
        return coordinate.getY();
    }

    @Override public String toString() {
        return "CartesianPoint2d{" +
            "x=" + getX() +
            ", y=" + getY() +
            '}';
    }
}

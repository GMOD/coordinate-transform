package org.bbop.apollo.projection;


/**
 * Created by nathandunn on 10/10/16.
 */
public abstract class AbstractProjection implements ProjectionInterface{

    public final static Long UNMAPPED_VALUE = -1l;

    public Coordinate projectCoordinate(Long min, Long max) {
        return new Coordinate(projectValue(min),projectValue(max));
    }

    public Coordinate projectReverseCoordinate(Long min, Long max) {
        return new Coordinate(projectReverseValue(min),projectReverseValue(max));
    }

    public Integer clear() {
        return 0;
    }
}

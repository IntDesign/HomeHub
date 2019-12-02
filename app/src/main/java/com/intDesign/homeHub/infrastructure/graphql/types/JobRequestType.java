// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.intDesign.homeHub.infrastructure.graphql.types;

/**
 * RoomJob Type
 */
public enum JobRequestType {
    PAINT("PAINT"),

    INVALID("INVALID"),

    /**
     * Auto generated constant for unknown enum values
     */
    $UNKNOWN("$UNKNOWN");

    private final String rawValue;

    JobRequestType(String rawValue) {
        this.rawValue = rawValue;
    }

    public String rawValue() {
        return rawValue;
    }

    public static JobRequestType safeValueOf(String rawValue) {
        for (JobRequestType enumValue : values()) {
            if (enumValue.rawValue.equals(rawValue)) {
                return enumValue;
            }
        }
        return JobRequestType.$UNKNOWN;
    }
}
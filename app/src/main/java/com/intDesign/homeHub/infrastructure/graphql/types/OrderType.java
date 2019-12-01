// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.intDesign.homeHub.infrastructure.graphql.types;

public enum OrderType {
    ASC("ASC"),

    DESC("DESC"),

    /**
     * Auto generated constant for unknown enum values
     */
    $UNKNOWN("$UNKNOWN");

    private final String rawValue;

    OrderType(String rawValue) {
        this.rawValue = rawValue;
    }

    public String rawValue() {
        return rawValue;
    }

    public static OrderType safeValueOf(String rawValue) {
        for (OrderType enumValue : values()) {
            if (enumValue.rawValue.equals(rawValue)) {
                return enumValue;
            }
        }
        return OrderType.$UNKNOWN;
    }
}

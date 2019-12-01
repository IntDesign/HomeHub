// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.intDesign.homeHub.infrastructure.graphql.mutations;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.internal.QueryDocumentMinifier;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class UpdateHouseMutation implements Mutation<UpdateHouseMutation.Data, UpdateHouseMutation.Data, UpdateHouseMutation.Variables> {
    public static final String OPERATION_ID = "e98fc2b1a45c4c0aa0c32a8a7db8b9c9ff578685d672823c23a7a468f85e8bbc";

    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify(
            "mutation UpdateHouse($id: String!) {\n"
                    + "  house:house {\n"
                    + "    __typename\n"
                    + "    removeHouse(id:$id) {\n"
                    + "      __typename\n"
                    + "      id\n"
                    + "    }\n"
                    + "  }\n"
                    + "}"
    );

    public static final OperationName OPERATION_NAME = () -> "UpdateHouse";

    private final UpdateHouseMutation.Variables variables;

    public UpdateHouseMutation(@NotNull String id) {
        Utils.checkNotNull(id, "id == null");
        variables = new UpdateHouseMutation.Variables(id);
    }

    @NotNull
    @Override
    public String operationId() {
        return OPERATION_ID;
    }

    @Override
    public String queryDocument() {
        return QUERY_DOCUMENT;
    }

    @Override
    public UpdateHouseMutation.Data wrapData(UpdateHouseMutation.Data data) {
        return data;
    }

    @Override
    public UpdateHouseMutation.Variables variables() {
        return variables;
    }

    @Override
    public ResponseFieldMapper<UpdateHouseMutation.Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    public static Builder builder() {
        return new Builder();
    }

    @NotNull
    @Override
    public OperationName name() {
        return OPERATION_NAME;
    }

    public static final class Builder {
        private @NotNull
        String id;

        Builder() {
        }

        public Builder id(@NotNull String id) {
            this.id = id;
            return this;
        }

        public UpdateHouseMutation build() {
            Utils.checkNotNull(id, "id == null");
            return new UpdateHouseMutation(id);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final @NotNull
        String id;

        private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

        Variables(@NotNull String id) {
            this.id = id;
            this.valueMap.put("id", id);
        }

        public @NotNull
        String id() {
            return id;
        }

        @NotNull
        @Override
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(valueMap);
        }

        @Override
        public InputFieldMarshaller marshaller() {
            return writer -> writer.writeString("id", id);
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {
                ResponseField.forObject("house", "house", null, true, Collections.emptyList())
        };

        final @Nullable
        House house;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public Data(@Nullable House house) {
            this.house = house;
        }

        public @Nullable
        House house() {
            return this.house;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return writer -> writer.writeObject($responseFields[0], house != null ? house.marshaller() : null);
        }

        @NotNull
        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "Data{"
                        + "house=" + house
                        + "}";
            }
            return $toString;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof Data) {
                Data that = (Data) o;
                return ((this.house == null) ? (that.house == null) : this.house.equals(that.house));
            }
            return false;
        }

        @Override
        public int hashCode() {
            if (!$hashCodeMemoized) {
                int h = 1;
                h *= 1000003;
                h ^= (house == null) ? 0 : house.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final House.Mapper houseFieldMapper = new House.Mapper();

            @Override
            public Data map(ResponseReader reader) {
                final House house = reader.readObject($responseFields[0], houseFieldMapper::map);
                return new Data(house);
            }
        }
    }

    public static class House {
        static final ResponseField[] $responseFields = {
                ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()),
                ResponseField.forObject("removeHouse", "removeHouse", new UnmodifiableMapBuilder<String, Object>(1)
                        .put("id", new UnmodifiableMapBuilder<String, Object>(2)
                                .put("kind", "Variable")
                                .put("variableName", "id")
                                .build())
                        .build(), true, Collections.emptyList())
        };

        final @NotNull
        String __typename;

        final @Nullable
        RemoveHouse removeHouse;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public House(@NotNull String __typename, @Nullable RemoveHouse removeHouse) {
            this.__typename = Utils.checkNotNull(__typename, "__typename == null");
            this.removeHouse = removeHouse;
        }

        public @NotNull
        String __typename() {
            return this.__typename;
        }

        public @Nullable
        RemoveHouse removeHouse() {
            return this.removeHouse;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return writer -> {
                writer.writeString($responseFields[0], __typename);
                writer.writeObject($responseFields[1], removeHouse != null ? removeHouse.marshaller() : null);
            };
        }

        @NotNull
        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "House{"
                        + "__typename=" + __typename + ", "
                        + "removeHouse=" + removeHouse
                        + "}";
            }
            return $toString;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof House) {
                House that = (House) o;
                return this.__typename.equals(that.__typename)
                        && ((this.removeHouse == null) ? (that.removeHouse == null) : this.removeHouse.equals(that.removeHouse));
            }
            return false;
        }

        @Override
        public int hashCode() {
            if (!$hashCodeMemoized) {
                int h = 1;
                h *= 1000003;
                h ^= __typename.hashCode();
                h *= 1000003;
                h ^= (removeHouse == null) ? 0 : removeHouse.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<House> {
            final RemoveHouse.Mapper removeHouseFieldMapper = new RemoveHouse.Mapper();

            @Override
            public House map(ResponseReader reader) {
                final String __typename = reader.readString($responseFields[0]);
                final RemoveHouse removeHouse = reader.readObject($responseFields[1], removeHouseFieldMapper::map);
                return new House(__typename, removeHouse);
            }
        }
    }

    public static class RemoveHouse {
        static final ResponseField[] $responseFields = {
                ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()),
                ResponseField.forString("id", "id", null, true, Collections.emptyList())
        };

        final @NotNull
        String __typename;

        final @Nullable
        String id;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public RemoveHouse(@NotNull String __typename, @Nullable String id) {
            this.__typename = Utils.checkNotNull(__typename, "__typename == null");
            this.id = id;
        }

        public @NotNull
        String __typename() {
            return this.__typename;
        }

        /**
         * House ID
         */
        public @Nullable
        String id() {
            return this.id;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return writer -> {
                writer.writeString($responseFields[0], __typename);
                writer.writeString($responseFields[1], id);
            };
        }

        @NotNull
        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "RemoveHouse{"
                        + "__typename=" + __typename + ", "
                        + "id=" + id
                        + "}";
            }
            return $toString;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof RemoveHouse) {
                RemoveHouse that = (RemoveHouse) o;
                return this.__typename.equals(that.__typename)
                        && ((this.id == null) ? (that.id == null) : this.id.equals(that.id));
            }
            return false;
        }

        @Override
        public int hashCode() {
            if (!$hashCodeMemoized) {
                int h = 1;
                h *= 1000003;
                h ^= __typename.hashCode();
                h *= 1000003;
                h ^= (id == null) ? 0 : id.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RemoveHouse> {
            @Override
            public RemoveHouse map(ResponseReader reader) {
                final String __typename = reader.readString($responseFields[0]);
                final String id = reader.readString($responseFields[1]);
                return new RemoveHouse(__typename, id);
            }
        }
    }
}

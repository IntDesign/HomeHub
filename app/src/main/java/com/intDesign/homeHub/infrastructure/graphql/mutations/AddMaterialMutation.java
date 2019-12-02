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
import com.intDesign.homeHub.infrastructure.graphql.types.MaterialCreateViewModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class AddMaterialMutation implements Mutation<AddMaterialMutation.Data, AddMaterialMutation.Data, AddMaterialMutation.Variables> {
    public static final String OPERATION_ID = "9623d21fdd46949608ee1595fa7deea60ff22056ebe591ea4a7628260bfee3e2";

    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify(
            "mutation AddMaterial($material:MaterialCreateViewModel!) {\n"
                    + "  material:material {\n"
                    + "    __typename\n"
                    + "    addMaterial(material:$material) {\n"
                    + "      __typename\n"
                    + "      id\n"
                    + "    }\n"
                    + "  }\n"
                    + "}"
    );

    public static final OperationName OPERATION_NAME = () -> "AddMaterial";

    private final AddMaterialMutation.Variables variables;

    public AddMaterialMutation(@NotNull MaterialCreateViewModel material) {
        Utils.checkNotNull(material, "material == null");
        variables = new AddMaterialMutation.Variables(material);
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
    public AddMaterialMutation.Data wrapData(AddMaterialMutation.Data data) {
        return data;
    }

    @Override
    public AddMaterialMutation.Variables variables() {
        return variables;
    }

    @Override
    public ResponseFieldMapper<AddMaterialMutation.Data> responseFieldMapper() {
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
        MaterialCreateViewModel material;

        Builder() {
        }

        public Builder material(@NotNull MaterialCreateViewModel material) {
            this.material = material;
            return this;
        }

        public AddMaterialMutation build() {
            Utils.checkNotNull(material, "material == null");
            return new AddMaterialMutation(material);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final @NotNull
        MaterialCreateViewModel material;

        private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

        Variables(@NotNull MaterialCreateViewModel material) {
            this.material = material;
            this.valueMap.put("material", material);
        }

        public @NotNull
        MaterialCreateViewModel material() {
            return material;
        }

        @NotNull
        @Override
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(valueMap);
        }

        @Override
        public InputFieldMarshaller marshaller() {
            return writer -> writer.writeObject("material", material.marshaller());
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {
                ResponseField.forObject("material", "material", null, true, Collections.emptyList())
        };

        final @Nullable
        Material material;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public Data(@Nullable Material material) {
            this.material = material;
        }

        public @Nullable
        Material material() {
            return this.material;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return writer -> writer.writeObject($responseFields[0], material != null ? material.marshaller() : null);
        }

        @NotNull
        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "Data{"
                        + "material=" + material
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
                return ((this.material == null) ? (that.material == null) : this.material.equals(that.material));
            }
            return false;
        }

        @Override
        public int hashCode() {
            if (!$hashCodeMemoized) {
                int h = 1;
                h *= 1000003;
                h ^= (material == null) ? 0 : material.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final Material.Mapper materialFieldMapper = new Material.Mapper();

            @Override
            public Data map(ResponseReader reader) {
                final Material material = reader.readObject($responseFields[0], materialFieldMapper::map);
                return new Data(material);
            }
        }
    }

    public static class Material {
        static final ResponseField[] $responseFields = {
                ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()),
                ResponseField.forObject("addMaterial", "addMaterial", new UnmodifiableMapBuilder<String, Object>(1)
                        .put("material", new UnmodifiableMapBuilder<String, Object>(2)
                                .put("kind", "Variable")
                                .put("variableName", "material")
                                .build())
                        .build(), true, Collections.emptyList())
        };

        final @NotNull
        String __typename;

        final @Nullable
        AddMaterial addMaterial;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public Material(@NotNull String __typename, @Nullable AddMaterial addMaterial) {
            this.__typename = Utils.checkNotNull(__typename, "__typename == null");
            this.addMaterial = addMaterial;
        }

        public @NotNull
        String __typename() {
            return this.__typename;
        }

        public @Nullable
        AddMaterial addMaterial() {
            return this.addMaterial;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return writer -> {
                writer.writeString($responseFields[0], __typename);
                writer.writeObject($responseFields[1], addMaterial != null ? addMaterial.marshaller() : null);
            };
        }

        @NotNull
        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "Material{"
                        + "__typename=" + __typename + ", "
                        + "addMaterial=" + addMaterial
                        + "}";
            }
            return $toString;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof Material) {
                Material that = (Material) o;
                return this.__typename.equals(that.__typename)
                        && ((this.addMaterial == null) ? (that.addMaterial == null) : this.addMaterial.equals(that.addMaterial));
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
                h ^= (addMaterial == null) ? 0 : addMaterial.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Material> {
            final AddMaterial.Mapper addMaterialFieldMapper = new AddMaterial.Mapper();

            @Override
            public Material map(ResponseReader reader) {
                final String __typename = reader.readString($responseFields[0]);
                final AddMaterial addMaterial = reader.readObject($responseFields[1], addMaterialFieldMapper::map);
                return new Material(__typename, addMaterial);
            }
        }
    }

    public static class AddMaterial {
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

        public AddMaterial(@NotNull String __typename, @Nullable String id) {
            this.__typename = Utils.checkNotNull(__typename, "__typename == null");
            this.id = id;
        }

        public @NotNull
        String __typename() {
            return this.__typename;
        }

        /**
         * Material ID
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
                $toString = "AddMaterial{"
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
            if (o instanceof AddMaterial) {
                AddMaterial that = (AddMaterial) o;
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

        public static final class Mapper implements ResponseFieldMapper<AddMaterial> {
            @Override
            public AddMaterial map(ResponseReader reader) {
                final String __typename = reader.readString($responseFields[0]);
                final String id = reader.readString($responseFields[1]);
                return new AddMaterial(__typename, id);
            }
        }
    }
}
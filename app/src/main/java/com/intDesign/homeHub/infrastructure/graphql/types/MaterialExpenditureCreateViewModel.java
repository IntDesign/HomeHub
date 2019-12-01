// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.intDesign.homeHub.infrastructure.graphql.types;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

import org.jetbrains.annotations.NotNull;

public final class MaterialExpenditureCreateViewModel implements InputType {
    private final @NotNull
    String materialInformationId;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    MaterialExpenditureCreateViewModel(@NotNull String materialInformationId) {
        this.materialInformationId = materialInformationId;
    }

    /**
     * Material Expenditure Material Information Id
     */
    public @NotNull
    String materialInformationId() {
        return this.materialInformationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public InputFieldMarshaller marshaller() {
        return writer -> writer.writeString("materialInformationId", materialInformationId);
    }

    @Override
    public int hashCode() {
        if (!$hashCodeMemoized) {
            int h = 1;
            h *= 1000003;
            h ^= materialInformationId.hashCode();
            $hashCode = h;
            $hashCodeMemoized = true;
        }
        return $hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof MaterialExpenditureCreateViewModel) {
            MaterialExpenditureCreateViewModel that = (MaterialExpenditureCreateViewModel) o;
            return this.materialInformationId.equals(that.materialInformationId);
        }
        return false;
    }

    public static final class Builder {
        private @NotNull
        String materialInformationId = "null";

        Builder() {
        }

        /**
         * Material Expenditure Material Information Id
         */
        public Builder materialInformationId(@NotNull String materialInformationId) {
            this.materialInformationId = materialInformationId;
            return this;
        }

        public MaterialExpenditureCreateViewModel build() {
            Utils.checkNotNull(materialInformationId, "materialInformationId == null");
            return new MaterialExpenditureCreateViewModel(materialInformationId);
        }
    }
}

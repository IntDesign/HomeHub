// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.intDesign.homeHub.infrastructure.graphql.types;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public final class PagedRequestType implements InputType {
  private final Input<Integer> take;

  private final Input<Integer> offset;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  PagedRequestType(Input<Integer> take, Input<Integer> offset) {
    this.take = take;
    this.offset = offset;
  }

  public @Nullable
  Integer take() {
    return this.take.value;
  }

  public @Nullable
  Integer offset() {
    return this.offset.value;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        if (take.defined) {
          writer.writeInt("take", take.value);
        }
        if (offset.defined) {
          writer.writeInt("offset", offset.value);
        }
      }
    };
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= take.hashCode();
      h *= 1000003;
      h ^= offset.hashCode();
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
    if (o instanceof PagedRequestType) {
      PagedRequestType that = (PagedRequestType) o;
      return this.take.equals(that.take)
              && this.offset.equals(that.offset);
    }
    return false;
  }

  public static final class Builder {
    private Input<Integer> take = Input.absent();

    private Input<Integer> offset = Input.absent();

    Builder() {
    }

    public Builder take(@Nullable Integer take) {
      this.take = Input.fromNullable(take);
      return this;
    }

    public Builder offset(@Nullable Integer offset) {
      this.offset = Input.fromNullable(offset);
      return this;
    }

    public Builder takeInput(@NotNull Input<Integer> take) {
      this.take = Utils.checkNotNull(take, "take == null");
      return this;
    }

    public Builder offsetInput(@NotNull Input<Integer> offset) {
      this.offset = Utils.checkNotNull(offset, "offset == null");
      return this;
    }

    public PagedRequestType build() {
      return new PagedRequestType(take, offset);
    }
  }
}
